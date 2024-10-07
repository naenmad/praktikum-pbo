/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ahmzl
 */
public class Bingo {
    public void sing() {
        String[] lyrics = {
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "And Bingo was his name-o."
        };

        String[] claps = {"(clap)", "I", "N", "G", "O"};

        for (int i = 0; i < 6; i++) {
            for (String line : lyrics) {
                System.out.println(line);
            }
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    if (k < i) {
                        System.out.print(claps[0]);
                    } else {
                        System.out.print(claps[k]);
                    }
                    if (k < 4) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o.");
        }
    }
}
