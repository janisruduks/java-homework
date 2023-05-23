package io.codelex.enums.practice;

import java.util.Scanner;

public class RockPapersScissorsGame {
    private static int turns = 0;
    private static double pcWins = 0;
    private static double userWins = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let us begin... *Dramatic sound*");
        String turn = "-";
        while (!turn.equals("q")) {
            System.out.print("Your turn (Enter s for scissor, p for paper, r for rock, q to quit): ");
            turn = in.nextLine();
            switch (turn) {
                case "s" -> getWinner(RockPaperScissors.SCISSORS);
                case "p" -> getWinner(RockPaperScissors.PAPER);
                case "r" -> getWinner(RockPaperScissors.ROCK);
                case "q" -> displayScoreAndQuit();
            }
        }
    }

    private static void getWinner(RockPaperScissors playerAttribute) {
        RockPaperScissors pcAttribute = RockPaperScissors.randomizeTurn();
        String pc = pcAttribute.getName();
        String pcBeats = pcAttribute.getBeats();
        String player = playerAttribute.getName();
        String playerBeats = playerAttribute.getBeats();
        System.out.println("My turn: " + pc);
        turns++;
        if (pc.equals(player)) {
            System.out.println("It's a tie");
        }
        else if (pcBeats.equals(player)) {
            System.out.println("You lost");
            pcWins++;
        }
        else if (playerBeats.equals(pc)) {
            userWins++;
            System.out.println("You won");
        }
    }

    private static void displayScoreAndQuit() {
        double procUser = (userWins / turns) * 100;
        double procPc = (pcWins / turns) * 100;
        System.out.println("Out of " + turns);
        System.out.printf("I won %.2f%% times. ", procPc);
        System.out.printf("You won %.2f%% times.", procUser);
        System.out.println("\nBye!");
    }
}
