package io.codelex.javaadvanced.basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BasketTest {

    @Test
    public void shouldBeAbleToFillBasket() {
        Mushroom item = new Mushroom();
        Basket<Mushroom> basket = new Basket<>();
        int startSize = basket.getBasketSize();
        try {
            basket.addToBasket(item);
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }
        assertEquals(startSize + 1, basket.getBasketSize());
    }

    @Test
    public void shouldNotBeAbleToAddMoreThan10() {
        Mushroom item = new Mushroom();
        Basket<Mushroom> basket = new Basket<>();
        try {
            for (int i = 0; i < 10; i++) {
                basket.addToBasket(item);
            }
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }
        assertEquals(10, basket.getBasketSize());
    }

}
