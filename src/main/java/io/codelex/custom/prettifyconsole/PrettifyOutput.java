package io.codelex.custom.prettifyconsole;

public enum Colors {
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    YELLOW("\033[0;33m"),
    BLUE("\033[0;34m"),
    PURPLE("\033[0;35m"),
    CYAN("\033[0;36m"),
    RESET("\033[0m");

    public final String COLOUR;

    Colors(String color) {
        this.COLOUR = color;
    }

    public static String chooseColour(String text, Colors color) {
        return color + text + RESET;
    }
}
