package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class CountUppercaseLetters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] letters = input.toCharArray();

        int sum = 0;
        for(char letter: letters){
            if((int) letter <= 90 && (int) letter >= 65){
                sum++;
            }
        }
        System.out.printf("Your input '%s' has %s uppercase letters", Cc.randomColour(input), Cc.randomColour(sum));
    }
}
