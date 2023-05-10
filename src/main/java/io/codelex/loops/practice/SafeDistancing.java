package io.codelex.loops.practice;

import java.util.Scanner;

public class SafeDistancing {
    // another reminder about covid, thanks.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: > ");
        String firstWord = scan.nextLine();
        System.out.print("\nEnter second word: > ");
        String secondWord = scan.nextLine();
        scan.close();

        // my way is slower because of repeat
        int dotsNeeded = 30 - firstWord.length() - secondWord.length();
        System.out.println(firstWord + ".".repeat(dotsNeeded) + secondWord);

        // task way is faster
        System.out.print(firstWord);
        for (int i = 0; i < dotsNeeded; i++) {
            System.out.print(".");
        }
        System.out.print(secondWord);
    }
}
