package io.codelex.arrays.practice;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {
            "hell", "midnight", "string", "boom", "idontknowhowtocode",
            "bigdecimal", "java", "baseball"
    };
    private static String wordToGuess = getWord();
    private static String emptyWord = getEmptyWord(wordToGuess);
    private static String letterMisses = "";

    public static void main(String[] args) {
        while (true) {
            System.out.println("*-".repeat(20));
            displayWord();
            checkIfContains();
            displayLetterMisses();

            if (checkIfWin()) {
                System.out.println(wordToGuess + " You guessed it!");
                restart();
            }
            if (checkIfLose()) {
                System.out.println("You failed in quest to find this word " + wordToGuess);
                restart();
            }
        }
    }

    private static char getLetter() {
        Scanner in = new Scanner(System.in);
        System.out.print("Guess: ");
        return in.next().charAt(0);
    }

    private static void checkIfContains() {
        char letter = getLetter();
        char[] word = wordToGuess.toCharArray();
        boolean found = false;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == letter) {
                letterFound(i, letter);
                found = true;
            }
        }
        if (!found) {
            setLetterMisses(letter);
        }
    }

    private static String getWord() {
        return randomWord();
    }

    private static String getEmptyWord(String word) {
        char[] wordToLetters = word.toCharArray();
        char[] wordLettersNull = new char[wordToLetters.length];
        for (int i = 0; i < wordToLetters.length; i++) {
            wordLettersNull[i] = '_';
        }
        return String.valueOf(wordLettersNull);
    }

    private static void letterFound(int pos, char letter) {
        char[] toFill = emptyWord.toCharArray();
        toFill[pos] = letter;
        emptyWord = String.valueOf(toFill);
    }

    private static void setLetterMisses(char letter) {
        letterMisses += letter;
    }

    private static boolean checkIfWin() {
        return Objects.equals(wordToGuess, emptyWord);
    }

    private static boolean checkIfLose() {
        return letterMisses.length() == 3;
    }

    private static void restart() {
        Scanner in = new Scanner(System.in);
        System.out.println("Play 'again' or 'quit'?");
        String answer = in.nextLine();
        if (Objects.equals(answer, "again")) {
            wordToGuess = getWord();
            emptyWord = getEmptyWord(wordToGuess);
            letterMisses = "";
        } else {
            System.exit(69);
        }
    }

    private static String randomWord() {
        Random random = new Random();
        int pos = random.nextInt(WORDS.length);
        return WORDS[pos];
    }

    private static void displayWord() {
        System.out.println("Word: " + emptyWord);
    }

    private static void displayLetterMisses() {
        System.out.println("Misses: " + letterMisses);
    }
}