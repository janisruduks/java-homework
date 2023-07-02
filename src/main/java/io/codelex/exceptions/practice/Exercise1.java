package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            int numerator;
            String input = "";
            try {
                System.out.print("Enter the numerator: ");
                input = scanner.next();
                numerator = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                if (input.startsWith("q") || input.startsWith("Q")) {
                    break;
                } else {
                    System.out.println("You entered bad data.");
                    System.out.println("Please try again.");
                    continue;
                }
            }
            try {
                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " is " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0");
            } catch (InputMismatchException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
            }
        }
    }
}
