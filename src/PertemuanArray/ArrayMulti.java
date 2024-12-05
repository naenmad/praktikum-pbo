package PertemuanArray;

public class ArrayMulti {
    public static void main(String[] args) {
        // int [][] angka = {
        //     {1, 2, 3, 4, 5},
        //     {6, 7, 8, 9, 10},
        //     {11, 12, 13, 14, 15}
        // };

        // for (int i = 0; i < angka.length; i++) {
        //     for (int ii = 0; ii < angka[i].length; ii++) {
        //         System.out.print(angka[i][ii] + " ");
        //     }
        //     System.out.println();
        // }

        String [][] nama = {
            {"Mas", "Bang", "Aa"},
            {"Satria", "Bergas", "Tohadi"}
        };
        System.out.println(nama[0][1] + " " + nama[1][0]);
        System.out.println(nama[0][0] + " " + nama[1][1]);
        System.out.println(nama[0][2] + " " + nama[1][2]);
    }
}
