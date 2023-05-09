package io.codelex.typesandvariables.practice;

import java.util.Random;

// Please ignore this
public class Cc {
    private static final String[] COLOURS = {
            "\033[0;31m", "\033[0;32m", "\033[0;33m",
            "\033[0;34m", "\033[0;35m", "\033[0;36m"
    };
    private static final String RESET = "\033[0m";

    public static String chooseColour(String text, int colour) {
        if (colour < 0 || colour >= COLOURS.length) {
            colour = 0;
        }
        return COLOURS[colour] + text + RESET;
    }

    public static String randomColour(String text) {
        Random random = new Random();
        String colour = COLOURS[random.nextInt(COLOURS.length)];
        return colour + text + RESET;
    }

    public static String randomColour(Number number) {
        Random random = new Random();
        String colour = COLOURS[random.nextInt(COLOURS.length)];
        return colour + number + RESET;
    }
}
