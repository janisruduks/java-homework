package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int value = in.nextInt();
        in.close();

        int sum = 0;
        int diceOne;
        int diceTwo;
        while (value != sum) {
            diceOne = diceRoll();
            diceTwo = diceRoll();
            sum = diceOne + diceTwo;
            System.out.printf("%d and %d = %d%n", diceOne, diceTwo, sum);
        }
    }

    private static int diceRoll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
