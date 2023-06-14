package io.codelex.javaadvanced.basket;

public class BasketTestApp {

    public static void main(String[] args) throws BasketEmptyException, BasketFullException {

        Basket<Mushroom> basket = new Basket<>();

        Mushroom mushroom1 = new Mushroom();

        basket.addToBasket(mushroom1);

        basket.removeFromBasket(mushroom1);

        basket.displayBasket();

    }

}
