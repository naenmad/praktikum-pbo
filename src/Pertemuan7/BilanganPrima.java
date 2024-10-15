package Pertemuan7;

public class BilanganPrima {
    // Program ini menghitung deret bilangan prima dan yang bukan bilangan prima dari 0-20
    public static void main(String[] args) {
        int bilangan;
        boolean prima;
        StringBuilder bilanganPrima = new StringBuilder("Bilangan Prima:\n");
        StringBuilder bilanganBukanPrima = new StringBuilder("Bilangan Bukan Prima:\n");

        for (int i = 0; i <= 20; i++) {
            bilangan = i;
            prima = true;

            if (bilangan < 2) {
                prima = false;
            } else {
                for (int j = 2; j <= Math.sqrt(bilangan); j++) {
                    if (bilangan % j == 0) {
                        prima = false;
                        break;
                    }
                }
            }

            if (prima) {
                bilanganPrima.append(bilangan).append("\n");
            } else {
                bilanganBukanPrima.append(bilangan).append("\n");
            }
        }

        System.out.println(bilanganPrima.toString());
        System.out.println(bilanganBukanPrima.toString());
    }
}