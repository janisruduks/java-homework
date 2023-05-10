package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        int dice = randomNumber();
        int points = dice;
        System.out.printf("You rolled a %d%n", dice);

        while(dice != 1){
            System.out.print("Roll again? ");
            String question = scan.next();
            if(question.equalsIgnoreCase("yes") || question.equalsIgnoreCase("y")){
                dice = randomNumber();
                points += dice;
                System.out.printf("You rolled a %d%n", dice);
            }else {
                break;
            }
        }
        scan.close();

        System.out.printf("You got %d points", points);
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
