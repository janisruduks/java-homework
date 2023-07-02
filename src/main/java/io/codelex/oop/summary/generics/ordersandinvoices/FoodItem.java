package io.codelex.oop.summary.generics.ordersandinvoices;

import java.time.LocalDate;

public class FoodItem extends AbstractItem {

    private final LocalDate bestBefore;

    public FoodItem(String name, double price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public FoodItem getItem() {
        return this;
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo() + " best before: " + bestBefore;
    }
}
