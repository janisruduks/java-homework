package io.codelex.classesandobjects.practice;

public class Product {
    private final String name;
    private double priceAtStart;
    private double amountAtStart;

    public Product(String name, double priceAtStart, double ammountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = ammountAtStart;
    }

    public void printProduct() {
        System.out.printf("%s, %.2f EUR, ammount %.0f%n", name, priceAtStart, amountAtStart);
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(double amountAtStart) {
        this.amountAtStart = amountAtStart;
    }
}
