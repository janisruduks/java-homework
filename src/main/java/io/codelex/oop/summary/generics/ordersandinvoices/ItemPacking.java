package io.codelex.oop.summary.generics.ordersandinvoices;

import java.text.DecimalFormat;

public class ItemPacking implements Service {

    private static final String name = "Item packing";
    private static final double price = 5.00;

    @Override
    public Item getItem() {
        return null;
    }

    @Override
    public String getFullInfo() {
        DecimalFormat df = new DecimalFormat("#.00");
        return name + ", " + df.format(price) + " EUR";
    }

    @Override
    public double getPrice() {
        return price;
    }
}
