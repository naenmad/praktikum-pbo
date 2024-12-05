package PertemuanArray;
import java.util.Scanner;

public class Kota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] kota = new String[10];

        System.out.print("Masukkan banyak data: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + i + ": ");
            kota[i] = scanner.next();
            
        }
        int kurang = 10;
        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + i + ": " + kota[i]);
            kurang--;
        }
        System.out.println("Data yang belum diisi: " + kurang);
        scanner.close();
    }
}
