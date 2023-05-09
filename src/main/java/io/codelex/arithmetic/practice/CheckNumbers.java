package io.codelex.arithmetic.practice;

public class CheckNumbers {
    public static boolean sumAndDiff(int x, int y) {
        int sum = x + y;
        int difference = Math.abs(x - y);
        return (x == 15) || (y == 15) || (sum == 15) || (difference == 15);
    }
}
