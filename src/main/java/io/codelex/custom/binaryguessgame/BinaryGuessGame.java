package io.codelex.custom.binaryguessgame;

import java.util.Scanner;

public class BinaryGuessGame {

    private static final double MAX_NUMBER = 10000.0;
    private static final int NUMBER_OF_GUESSES = log2((int) MAX_NUMBER);

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to number guessing game!");
        System.out.println("YES! Ladies and gentlemen I will guess your number!");
        System.out.println("Choose number between 1-" + (int) MAX_NUMBER);
        System.out.println("Rules are, I will have " + NUMBER_OF_GUESSES + " guesses and you have to tell me");
        System.out.println("if it's less or higher than I chose");
        System.out.println("type 'chosen' when you chose your number: ");

        String answer = keyboard.next().toLowerCase();
        if (answer.equals("chosen")) {
            spamTerminalScreen("");
            guessTheNumber(keyboard);
        } else {
            System.out.println("You are not worthy...");
            System.exit(0);
        }
    }

    private static void guessTheNumber(Scanner keyboard) {

        double magicNumber = MAX_NUMBER / 2;
        double binaryMagic = magicNumber;

        for (int i = 0; i < NUMBER_OF_GUESSES; i++) {
            System.out.println("Is your number higher 'h' or lower 'l' than " + Math.round(binaryMagic));
            System.out.println("Or if I guessed type 'CHAD'");
            String answer = keyboard.next().toLowerCase();
            magicNumber = magicNumber / 2;

            switch (answer) {
                case "h" -> binaryMagic += magicNumber;
                case "l" -> binaryMagic -= magicNumber;
                case "chad" -> {
                    spamTerminalScreen("I GUESSED WHOHOOO!!!");
                    System.exit(0);
                }
            }
        }
        System.out.println("I have failed my people...");
    }

    private static void spamTerminalScreen(String message) {
        for (int i = 0; i < 100; i++) {
            System.out.println(message);
        }
    }

    // Calculates maximum number of searches in perfectly balanced binary tree.
    private static int log2(int n) {
        return (int) Math.ceil(Math.log(n) / Math.log(2));
    }
}
