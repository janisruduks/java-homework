package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    private static final String[] DAY_NAMES = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input a number to get a corresponding day ");

        int input = 0;

        if (in.hasNextInt()) {
            System.out.println("Please enter digit from 1-7");
            input = in.nextInt();
        } else {
            System.out.println("Please enter valid digit.");
            System.exit(0);
        }

        in.close();

        if (input == 1) {
            System.out.println(input + " is " + DAY_NAMES[0]);
        } else if (input == 2) {
            System.out.println(input + " is " + DAY_NAMES[1]);
        } else if (input == 3) {
            System.out.println(input + " is " + DAY_NAMES[2]);
        } else if (input == 4) {
            System.out.println(input + " is " + DAY_NAMES[3]);
        } else if (input == 5) {
            System.out.println(input + " is " + DAY_NAMES[4]);
        } else if (input == 6) {
            System.out.println(input + " is " + DAY_NAMES[5]);
        } else if (input == 7) {
            System.out.println(input + " is " + DAY_NAMES[6]);
        } else {
            System.out.println("Error: wrong input, please try to use digit from 1-7");
        }

        switch (input) {
            case 1 -> System.out.println(input + " is " + DAY_NAMES[0]);
            case 2 -> System.out.println(input + " is " + DAY_NAMES[1]);
            case 3 -> System.out.println(input + " is " + DAY_NAMES[2]);
            case 4 -> System.out.println(input + " is " + DAY_NAMES[3]);
            case 5 -> System.out.println(input + " is " + DAY_NAMES[4]);
            case 6 -> System.out.println(input + " is " + DAY_NAMES[5]);
            case 7 -> System.out.println(input + " is " + DAY_NAMES[6]);
            default -> System.out.println("Error: wrong input, please try to use digit from 1-7");
        }
    }
}
