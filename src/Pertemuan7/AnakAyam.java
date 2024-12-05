package Pertemuan7;

public class AnakAyam {
    // Program ini menghitung lagu anak ayam turun 1 hingga habis
    public static void main(String[] args) {
        // Memulai dari 10 anak ayam (Ubah sesuai keinginan)
        int ayam = 10;
        StringBuilder lagu = new StringBuilder("Lagu Anak Ayam:\n");

        for (int i = ayam; i >= 0; i--) {
            if (i == 0) {
                lagu.append("Mati satu tinggalah induknya\n");
            } else {
                lagu.append("Anak ayam turun ").append(i).append(", mati satu tinggalah ").append(i - 1).append("\n");
            }
        }

        System.out.println(lagu.toString());
    }
}
