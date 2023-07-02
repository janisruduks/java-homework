package io.codelex.collections.practice;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        while (true) {
            String[] digits = Integer.toString(number).split("");
            number = 0;
            for (String digit : digits) {
                int parsedDigit = Integer.parseInt(digit);
                number += parsedDigit * parsedDigit;
            }
            if (number == 1) {
                System.out.println("Happy number :)");
                break;
            } else if (number == 4) {
                System.out.println("Not happy number :(");
                break;
            }
        }
    }
}
