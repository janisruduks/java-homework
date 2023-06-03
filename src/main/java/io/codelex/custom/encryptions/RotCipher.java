package io.codelex.custom.encryptions;

import java.util.Scanner;

public class RotCipher {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome ROT cipher encoder and decoder");
        System.out.println("Enter text you want to encrypt or decrypt.");
        rotateText(in.nextLine());

    }

    private static void rotateText(String plainText) {
        StringBuilder rotatedText = new StringBuilder();

        char[] plainTextCharArray = plainText.toCharArray();

        for (int i = 0; i <= 25; i++) {

            for (char letter : plainTextCharArray) {

                if (Character.isUpperCase(letter) && letter + i >= '[') {
                    int newLetter = Math.abs('Z' - letter - i) + '@';
                    letter = (char) newLetter;

                } else if (Character.isLowerCase(letter) && letter + i >= '{') {
                    int newLetter = Math.abs('z' - letter - i) + '`';
                    letter = (char) newLetter;

                } else if (Character.isAlphabetic(letter)) {
                    letter = (char) (letter + i);
                }
                rotatedText.append(letter);
            }
            System.out.println("ROT" + i + ": " + rotatedText);
            rotatedText = new StringBuilder();
        }
    }

}
