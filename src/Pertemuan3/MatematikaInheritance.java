package Pertemuan3;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 matematika = new Matematika2();

        int a = 20;
        int b = 10;

        int hasilPertambahan = matematika.pertambahan(a, b);
        int hasilPengurangan = matematika.pengurangan(a, b);
        int hasilPerkalian = matematika.perkalian(a, b);
        int hasilPembagian = matematika.pembagian(a, b);
        int hasilModulus = matematika.modulus(a, b);

        System.out.println("Pertambahan : " + a + " + " + b + " = " + hasilPertambahan);
        System.out.println("Pengurangan : " + a + " - " + b + " = " + hasilPengurangan);
        System.out.println("Perkalian : " + a + " * " + b + " = " + hasilPerkalian);
        System.out.println("Pembagian : " + a + " / " + b + " = " + hasilPembagian);
        System.out.println("Modulus : " + a + " % " + b + " = " + hasilModulus);
    }
}