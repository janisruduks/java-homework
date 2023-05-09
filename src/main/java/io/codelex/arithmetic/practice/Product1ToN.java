package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int sum = 1;

        for (int i = start + 1; i <= end; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
