package io.codelex.oop.summary.generics.ordersandinvoices;

public class HouseholdItem extends AbstractItem {

    private final String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public HouseholdItem getItem() {
        return this;
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo() + " color: " + color;
    }
}
