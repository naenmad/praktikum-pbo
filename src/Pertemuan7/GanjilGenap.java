package Pertemuan7;

public class GanjilGenap {
    // Program menghitung bilangan ganjil dan genap dari 0-20
    public static void main(String[] args) {
        StringBuilder bilanganGanjil = new StringBuilder("Bilangan Ganjil:\n");
        StringBuilder bilanganGenap = new StringBuilder("Bilangan Genap:\n");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                bilanganGenap.append(i).append("\n");
            } else {
                bilanganGanjil.append(i).append("\n");
            }
        }

        System.out.println(bilanganGenap.toString());
        System.out.println(bilanganGanjil.toString());
    }
}
