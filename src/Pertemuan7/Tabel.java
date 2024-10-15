package Pertemuan7;
import java.util.Scanner;

public class Tabel {
    // Program ini membuat tabel perkalian dari 1 sampai n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai n: ");
            int n = scanner.nextInt();
            StringBuilder tabel = new StringBuilder();
    
            int i = 1;
            do {
                int j = 1;
                do {
                    tabel.append(i * j).append("\t");
                    j++;
                } while (j <= n);
                tabel.append("\n");
                i++;
            } while (i <= n);
    
            System.out.println(tabel.toString());
        }
    }
}