package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Maybe in future create some way to decode numbers
        System.out.println("Phone keypad cipher");
        System.out.print("Enter a word to decrypt: ");
        String input = in.next().toLowerCase();
        in.close();

        char[] letters = input.toCharArray();

        for (char letter : letters) {

            switch (letter) {
                case 'a', 'b', 'c' -> System.out.print(2);
                case 'd', 'e', 'f' -> System.out.print(3);
                case 'g', 'h', 'i' -> System.out.print(4);
                case 'j', 'k', 'l' -> System.out.print(5);
                case 'm', 'n', 'o' -> System.out.print(6);
                case 'p', 'r', 's' -> System.out.print(7);
                case 't', 'u', 'v' -> System.out.print(8);
                case 'w', 'x', 'y' -> System.out.print(9);
                default -> System.out.println("Error: Only words are allowed.");
            }
        }
    }
}
