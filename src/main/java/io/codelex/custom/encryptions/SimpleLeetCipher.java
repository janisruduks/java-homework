package io.codelex.custom.encryptions;

import java.util.Scanner;

public class SimpleLeetCipher {
    // Something to use in IRC
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(leetConverter("Welcome to simple LEET converter."));
        System.out.println(leetConverter("Enter message to convert: "));
        System.out.println(leetConverter(in.nextLine()));
    }

    private static String leetConverter(String plainText) {
        StringBuilder converted = new StringBuilder();
        char[] characters = plainText.toCharArray();
        for (char character : characters) {
            switch (character) {
                case 'A', 'a' -> converted.append('@');
                case 'E', 'e' -> converted.append('3');
                case 'O', 'o' -> converted.append('0');
                case 'L', 'I', 'l', 'i' -> converted.append('1');
                case 'S', 's' -> converted.append('5');
                case 'T', 't' -> converted.append('7');
                default -> converted.append(character);
            }
        }
        return converted.toString();
    }
}
