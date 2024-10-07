/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ahmzl
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        OperasiMatematika matematika = new Matematika();

        // Memasukan contoh inputan
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 10;
        int e = 20;
        int f = 21;

        int hasilPertambahan = matematika.pertambahan(e, d);
        int hasilPengurangan = matematika.pengurangan(d, c);
        int hasilPerkalian = matematika.perkalian(d, b);
        int hasilPembagian = matematika.pembagian(f, a);

        System.out.println("Pertambahan : " + e + " + " + d + " = " + hasilPertambahan);
        System.out.println("Pengurangan : " + d + " - " + c + " = " + hasilPengurangan);
        System.out.println("Perkalian : " + d + " * " + b + " = " + hasilPerkalian);
        System.out.println("Pembagian : " + f + " / " + a + " = " + hasilPembagian);
    }
}
