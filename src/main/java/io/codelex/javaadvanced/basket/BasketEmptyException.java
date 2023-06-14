package io.codelex.javaadvanced.basket;

public class BasketEmptyException extends Exception {

    public BasketEmptyException() {
        super("Basket is empty!");
    }
}
