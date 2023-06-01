package io.codelex.custom.encryptions;

import java.util.Scanner;

public class RotCipher {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("To encrypt your message choose rotation between 1 - 25");
        int rot = in.nextInt();
        System.out.println("and type text you want to encrypt.");
        in.nextLine();
        String text = in.nextLine();
        rotEncrypt(rot, text);


    }

    private static void rotEncrypt(int rot, String encryptedText) {
        StringBuilder decryptedText = new StringBuilder();

        char[] encryptedTextArray = encryptedText.toCharArray();

        for (char letter : encryptedTextArray) {

            if (Character.isUpperCase(letter) && letter + rot > '[') {
                int newLetter = Math.abs('Z' - letter - rot) + '@';
                letter = (char) newLetter;

            } else if (Character.isLowerCase(letter) && letter + rot > '{') {
                int newLetter = Math.abs('z' - letter - rot) + '`';
                letter = (char) newLetter;

            } else if (Character.isAlphabetic(letter)) {
                letter = (char) (letter + rot);
            }
            decryptedText.append(letter);
        }
        System.out.println("Your encrypted message ROT" + rot + ": " + decryptedText);
    }


}
