package io.codelex.typesandvariables.practice;

import java.util.Random;

public class Cc {
    private static final String RESET = "\033[0m";
    private static final String RED = "\033[0;31m";
    private static final String GREEN = "\033[0;32m";
    private static final String YELLOW = "\033[0;33m";
    private static final String BLUE = "\033[0;34m";
    private static final String PURPLE = "\033[0;35m";
    private static final String CYAN = "\033[0;36m";
    public static final String[] colours = {RED, GREEN, YELLOW, BLUE, PURPLE, CYAN};
    private static String randomColour(){
        Random r = new Random();
        int randomNumber = r.nextInt(colours.length);
        return colours[randomNumber];
    }
    public static String chooseColour(String text, int colour){
        try{
            return colours[colour] + text + RESET;
        }catch (ArrayIndexOutOfBoundsException error){
            return colours[colour - 3] + text + RESET;
        }
    }
    public static String randomColour(int number){
        return randomColour() + number + RESET;
    }
    public static String randomColour(String text){
        return randomColour() + text + RESET;
    }
    public static String randomColour(double decimal){
        return randomColour() + decimal + RESET;
    }
}
