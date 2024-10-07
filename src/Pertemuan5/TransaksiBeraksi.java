package Pertemuan5;

import java.util.Scanner;

public class TransaksiBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.print("Total pembelian Rp. = ");
            double totalPembelian = scanner.nextDouble();

            Transaksi transaksi = new Transaksi(totalPembelian);

            double potongan = transaksi.hitungPotongan();
            double jumlahBayar = transaksi.hitungJumlahBayar();

            System.out.println("Besarnya potongan Rp. " + potongan);
            System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahBayar);

            System.out.print("Apakah Anda ingin menghitung transaksi lagi? (y/n): ");
            pilihan = scanner.next();

            // Consume the newline character left by nextDouble()
            scanner.nextLine();
        } while (pilihan.equalsIgnoreCase("y"));

        scanner.close();
    }
}