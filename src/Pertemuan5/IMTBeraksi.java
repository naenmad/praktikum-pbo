package Pertemuan5;

import java.util.Scanner;

public class IMTBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.print("Berat Badan (kg): ");
            double beratBadan = scanner.nextDouble();

            System.out.print("Tinggi Badan (m): ");
            double tinggiBadan = scanner.nextDouble();

            IMT imt = new IMT(beratBadan, tinggiBadan);

            double nilaiIMT = imt.hitungIMT();
            String kriteria = imt.tentukanKriteria();

            System.out.println("Nilai IMT: " + nilaiIMT);
            System.out.println("Kriteria: " + kriteria);

            System.out.print("Apakah Anda ingin menghitung IMT lagi? (y/n): ");
            pilihan = scanner.next();
        } while (pilihan.equalsIgnoreCase("y"));

        scanner.close();
    }
}