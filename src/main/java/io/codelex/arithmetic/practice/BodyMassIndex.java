package io.codelex.arithmetic.practice;

public class BodyMassIndex {
    public static void main(String[] args) {
        calculate(20, 179);
    }

    public static void calculate(double kg, double cm) {
        double heightInInches = cm / 2.54;
        double weightInPounds = kg * 2.205;

        double result = (weightInPounds * 703) / (heightInInches * heightInInches);
        if (result < 18.5) {
            System.out.printf("Your result is: %.2f%nYou are considered underweight", result);
        } else if (result > 25) {
            System.out.printf("Your result is: %.2f%nYou are considered overweight", result);
        }
    }
}
