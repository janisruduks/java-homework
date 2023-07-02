package io.codelex.javaadvanced.basket;

public class BasketFullException extends Exception {

    public BasketFullException() {
        super("ERROR: Basket is full!");
    }
}
