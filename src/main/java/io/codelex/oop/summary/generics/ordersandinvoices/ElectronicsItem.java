package io.codelex.oop.summary.generics.ordersandinvoices;

public class ElectronicsItem extends AbstractItem {

    private final String power;

    public ElectronicsItem(String name, double price, String power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public ElectronicsItem getItem() {
        return this;
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo() + " power: " + power + "W";
    }
}
