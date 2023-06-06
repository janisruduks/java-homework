package io.codelex.custom.prettifyconsole;

import java.util.Random;

// Please ignore this
public class PrettifyConsole {
    private static final String[] COLOURS = {
            "\033[0;31m", "\033[0;32m", "\033[0;33m",
            "\033[0;34m", "\033[0;35m", "\033[0;36m"
    };
    private static final String[] BOLD_COLOURS = {
            "\033[1;31m", "\033[1;32m", "\033[1;33m",
            "\033[1;34m", "\033[1;35m", "\033[1;36m"
    };
    private static final String[] BG_COLOURS = {
            "\u001B[41m", "\u001B[42m", "\u001B[43m",
            "\u001B[44m", "\u001B[45m", "\033[1;35m"
    };
    private static final String RESET = "\033[0m";

    public static String chooseColour(String text, Colors colour) {
        return colour + text + RESET;
    }

    public static String chooseColourB(String text, int colour) {
        if (colour < 0 || colour >= BOLD_COLOURS.length) {
            colour = 0;
        }
        return BOLD_COLOURS[colour] + text + RESET;
    }

    public static String chooseBG(String text, int colour) {
        if (colour < 0 || colour >= BG_COLOURS.length) {
            colour = 0;
        }
        return BG_COLOURS[colour] + text + RESET;
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
