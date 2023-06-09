package io.codelex.typesandvariables.practice;

import io.codelex.custom.prettifyconsole.Old_PrettifyConsole;

import java.util.Scanner;

// uses Cc class for colours
public class CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] letters = input.toCharArray();

        int sum = 0;
        for (char letter : letters) {
            if ((int) letter <= 90 && (int) letter >= 65) {
                sum++;
            }
        }
        System.out.printf("Your input '%s' has %s uppercase letters", Old_PrettifyConsole.randomColour(input), Old_PrettifyConsole.randomColour(sum));
    }
}
