package io.codelex.oop.summary.generics.ordersandinvoices;

import java.text.DecimalFormat;

abstract class AbstractItem implements Item {

    protected String name;
    protected double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getFullInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name + ", " + df.format(price) + " EUR,";
    }
}
