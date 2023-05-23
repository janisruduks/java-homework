package io.codelex.enums.practice;

import java.util.Scanner;

public class RockPapersScissorsGame {
    private static int turns = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let us begin... *Dramatic sound*");
        String turn = "-";
        while (!turn.equals("q")) {
            System.out.print("Your turn (Enter s for scissor, p for paper, r for rock, q to quit): ");
            turn = in.nextLine();
            switch (turn) {
                case "s" -> System.out.println(RockPaperScissors.SCISSORS);
                case "p" -> System.out.println(RockPaperScissors.PAPER);
                case "r" -> System.out.println(RockPaperScissors.ROCK);
                case "q" -> System.out.println("Bye");
            }
        }
    }

    private static void getWinner(RockPaperScissors turn) {
        //TODO
    }
}
