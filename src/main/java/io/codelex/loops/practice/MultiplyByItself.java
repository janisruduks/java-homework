package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        /*
        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (.......) {
          System.out.println(........);
        }
        */
        for (i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
    }

}
