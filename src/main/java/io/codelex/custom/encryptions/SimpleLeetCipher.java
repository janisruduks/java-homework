package io.codelex.custom.encryptions;

import java.util.Scanner;

public class SimpleLeetCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(leetConverter("Welcome to simple LEET converter."));
        System.out.println(leetConverter("Enter message to convert: "));
        System.out.println(leetConverter(in.nextLine()));
    }

    private static String leetConverter(String plainText) {
        StringBuilder converted = new StringBuilder();
        char[] characters = plainText.toUpperCase().toCharArray();
        for (char c : characters) {
            switch (c) {
                case 'A' -> converted.append('@');
                case 'E' -> converted.append('3');
                case 'O' -> converted.append('0');
                case 'L', 'I' -> converted.append('1');
                case 'S' -> converted.append('5');
                case 'T' -> converted.append('7');
                default -> converted.append(c);
            }
        }
        return converted.toString();
    }

}
