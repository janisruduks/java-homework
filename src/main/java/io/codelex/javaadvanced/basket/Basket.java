package io.codelex.javaadvanced.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private final List<T> basketItems = new ArrayList<>(10);

    public void addToBasket(T item) throws BasketFullException {
        if (basketItems.size() >= 10) {
            throw new BasketFullException();
        }
        basketItems.add(item);
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (basketItems.isEmpty()) {
            throw new BasketEmptyException();
        }
        basketItems.remove(item);
    }

    public int getBasketSize() {
        return basketItems.size();
    }

    public void displayBasket() {
        System.out.println(basketItems);
    }
}
