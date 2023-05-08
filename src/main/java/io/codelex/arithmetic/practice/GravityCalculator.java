package io.codelex.arithmetic.practice;

public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition;

        finalPosition = initialVelocity + initialPosition * fallingTime + 0.5 * (gravity * (fallingTime * fallingTime));
        System.out.printf("The object's position after %f seconds is %f m.", fallingTime, finalPosition);
    }
}
