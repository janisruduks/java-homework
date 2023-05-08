package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }

        float average = sum / (float) upperBound;

        System.out.printf("The sum of %d to %d is %d%n", lowerBound, upperBound, sum);
        System.out.printf("The avarage is %.1f", average);
    }
}
