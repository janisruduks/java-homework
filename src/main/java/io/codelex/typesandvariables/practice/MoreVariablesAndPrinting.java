package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String name = "Zed A. Shaw";
        int age = 35;
        int heightInInches = 74;
        int weightInPounds = 180;
        double poundsToKilos = weightInPounds * 0.45359237d;
        double inchesToCentimeters = heightInInches * 2.54f;
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        System.out.printf("Let's talk about %s.%n", name);
        System.out.printf("He's %d inches tall in barbaric units.%n", heightInInches);
        System.out.printf("He's %d pounds heavy in barbaric units.%n", weightInPounds);
        System.out.printf("In normal units he's %.2f centimeters tall.%n", inchesToCentimeters);
        System.out.printf("In normal units he's %.2f kilos heavy.%n", poundsToKilos);
        System.out.println("Actually, that's not too heavy.");
        System.out.printf("He's got %s eyes and %s hair.%n", eyes, hair);
        System.out.printf("His teeth are usually %s depending on the coffee.", teeth);
        System.out.printf("If I add %d, %d, and %d I get %d. That's in barbaric units.%n", age, heightInInches,
                weightInPounds, age + heightInInches + weightInPounds
        );
        System.out.printf("If I add %d, %.2f, and %.2f I get %.2f. In normal unit's",
                age, inchesToCentimeters, poundsToKilos, age + inchesToCentimeters + inchesToCentimeters
        );
    }
}