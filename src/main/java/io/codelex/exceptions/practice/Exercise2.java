package io.codelex.exceptions.practice;

import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public static void methodC() throws ArithmeticException {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
