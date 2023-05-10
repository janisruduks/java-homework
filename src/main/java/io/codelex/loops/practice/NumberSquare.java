package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Min? ");
        int min = in.nextInt();

        System.out.print("Max? ");
        int max = in.nextInt();

        for (int i = 1; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = 1; k < min; k++) {
                System.out.print(k);
            }
            System.out.println();
            min++;
        }
    }
}
