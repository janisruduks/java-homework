package io.codelex.exceptions.practice;

public class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException() {
        super("Yo buddy, this number is less than zero");
    }
}
