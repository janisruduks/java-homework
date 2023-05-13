package io.codelex.classesandobjects.practice;

public class ProductTest {
    public static void main(String[] args) {
        Product myProduct1 = new Product("Logitech mouse", 70.00, 14);
        myProduct1.printProduct();
        myProduct1.setPriceAtStart(69.99);
        myProduct1.setAmmountAtStart(42);
        myProduct1.printProduct();
    }
}
