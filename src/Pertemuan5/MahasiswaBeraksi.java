package Pertemuan5;
import java.util.Scanner;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.println("Input Perhitungan Nilai Mahasiswa");
            System.out.print("NPM: ");
            String npm = scanner.nextLine();

            System.out.print("Nama Mahasiswa: ");
            String nama = scanner.nextLine();

            System.out.print("Nilai Kehadiran: ");
            double nilaiKehadiran = scanner.nextDouble();

            System.out.print("Nilai Tugas: ");
            double nilaiTugas = scanner.nextDouble();

            System.out.print("Nilai UTS: ");
            double nilaiUTS = scanner.nextDouble();

            System.out.print("Nilai UAS: ");
            double nilaiUAS = scanner.nextDouble();

            // Mengonsumsi karakter newline agar tidak terjadi bug
            scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

            System.out.println("\nHasil Perhitungan:");
            System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
            System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
            System.out.println("Nilai Rata-rata: " + mahasiswa.hitungNilaiRataRata());
            System.out.println("Grade: " + mahasiswa.tentukanGrade());
            System.out.println("Keterangan: " + mahasiswa.tentukanKeterangan());

            System.out.print("Apakah Anda ingin menghitung nilai mahasiswa lagi? (y/n): ");
            pilihan = scanner.nextLine();
        } while (pilihan.equalsIgnoreCase("y"));

        scanner.close();
    }
}