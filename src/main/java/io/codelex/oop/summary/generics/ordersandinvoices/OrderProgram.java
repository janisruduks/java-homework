package io.codelex.oop.summary.generics.ordersandinvoices;

import java.time.LocalDate;

public class OrderProgram {

    public static void main(String[] args) throws WrongOrderException, BadFoodException {

        LocalDate dateBefore = LocalDate.of(2023, 6, 23);
        LocalDate expired = LocalDate.of(1990, 3, 24);

        FoodItem foodItem1 = new FoodItem("Milk", 0.75, dateBefore);
        ElectronicsItem electronicsItem1 = new ElectronicsItem("Radio", 25.00, "100");
        HouseholdItem householdItem1 = new HouseholdItem("Bucket", 5.00, "red");
        ItemPacking itemPacking = new ItemPacking();

        Order order1 = new Order();
        order1.addItem(foodItem1);
        order1.addItem(electronicsItem1);
        order1.addItem(householdItem1);

        Invoice invoice1 = new Invoice(order1, "ABC123");
        System.out.println(invoice1.getInvoiceText());

        order1.addItem(itemPacking);

        Invoice invoice2 = new Invoice(order1, "ABC231");

        System.out.println(invoice2.getInvoiceText());

        Order order2 = new Order();
        Invoice invoice3 = new Invoice(order2, "ABC321");
    }
}
