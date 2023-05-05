package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String name = "Zed A. Shaw";
        int age = 35;
        int height = 74;
        int weight = 180;
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's "+ height +" inches tall in barbaric units.");
        System.out.println("He's " + weight + " pounds heavy in barbaric units.");
        System.out.printf("In normal units he's %.2f centimeters tall.%n", toCentimeters(height));
        System.out.printf("In normal units he's %.2f kilos heavy.%n", toKilos(weight));
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");
        System.out.printf("If I add %d, %d, and %d I get %d. That's in barbaric units.%n", age, height, weight, age + height + weight);
        System.out.printf("If I add %d, %.2f, and %.2f I get %.2f. In normal unit's",
                age, toCentimeters(height), toKilos(weight), age + toCentimeters(height) + toKilos(weight));
    }
    private static double toKilos(double pounds){
        double kilosConversionRate = 0.45359237d;
        return pounds * kilosConversionRate;
    }
    private static double toCentimeters(float inches){
        float centimetersConversionRate = 2.54f;
        return inches * centimetersConversionRate;
    }
}