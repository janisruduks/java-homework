package io.codelex.custom.prettifyconsole;

public enum PrettifyOutput {
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    YELLOW("\033[0;33m"),
    BLUE("\033[0;34m"),
    PURPLE("\033[0;35m"),
    CYAN("\033[0;36m"),
    RESET("\033[0m");

    public final String colour;

    PrettifyOutput(String color) {
        this.colour = color;
    }

    public static String chooseColour(String text, PrettifyOutput color) {
        return color.colour + text + RESET.colour;
    }
}
