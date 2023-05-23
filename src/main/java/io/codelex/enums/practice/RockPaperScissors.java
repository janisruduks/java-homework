package io.codelex.enums.practice;

import java.util.Random;

public enum RockPaperScissors {
    ROCK("Rock", "Scissors"),
    PAPER("Paper", "Rock"),
    SCISSORS("Scissors", "Paper");

    private static final Random RNG = new Random();

    private final String name;
    private final String beats;

    RockPaperScissors(String name, String beats) {
        this.name = name;
        this.beats = beats;
    }

    public static RockPaperScissors randomizeTurn() {
        RockPaperScissors[] rockPaperScissors = values();
        return rockPaperScissors[RNG.nextInt(rockPaperScissors.length)];
    }
}
