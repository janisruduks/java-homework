package io.codelex.javaadvanced.bankcards;

public class NotEnoughFundsException extends Exception {

    public NotEnoughFundsException() {
        super("ERROR: Not enough funds for this action.");

    }
}
