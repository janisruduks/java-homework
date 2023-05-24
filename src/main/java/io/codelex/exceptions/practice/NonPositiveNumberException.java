package io.codelex.exceptions.practice;

public class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException() {
        System.out.println("Yo buddy, this number is less than zero");
    }
}
