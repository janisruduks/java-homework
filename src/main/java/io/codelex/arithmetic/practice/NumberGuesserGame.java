package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.print("I'm thinking of a number between 1-100. ");
        System.out.print("Try to guess it:\n> ");

        int userInput = scan.nextInt();
        scan.close();

        String pcThinks = "  I was thinking of " + randomNumber + ".";

        if(userInput > randomNumber) {
            System.out.print("Sorry, you are too high." + pcThinks );
        }else if(userInput < randomNumber) {
            System.out.print("Sorry, you are too low." + pcThinks );
        }else {
            System.out.print("You guessed it!  What are the odds?!?");
        }
    }
}
