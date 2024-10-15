package Pertemuan7;

public class HurufDescending {
    // Membuat program yang menampilkan huruf abjad secara descending
    public static void main(String[] args) {
        StringBuilder huruf = new StringBuilder("Huruf Descending:\n");

        for (char i = 'Z'; i >= 'A'; i--) {
            huruf.append(i).append("\n");
        }

        System.out.println(huruf.toString());
    }
}
