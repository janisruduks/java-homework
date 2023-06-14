package io.codelex.javaadvanced.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private final List<T> basketItems = new ArrayList<>(10);
    private int basketSize = 0;

    public void addToBasket(T item) throws BasketFullException {
        if (basketSize == 10) {
            throw new BasketFullException();
        } else {
            basketItems.add(item);
            basketSize++;
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (basketSize == 0) {
            throw new BasketEmptyException();
        } else {
            basketItems.remove(item);
            basketSize--;
        }
    }

    public int getBasketSize() {
        return basketSize;
    }

    public void displayBasket() {
        System.out.println(basketItems);
    }


}
