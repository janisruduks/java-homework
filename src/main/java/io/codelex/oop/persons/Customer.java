package io.codelex.oop.persons;

public class Customer extends Person {
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    String getInfo() {
        return getFirstName() + " " + getLastName() + " - "
                + getId() + " - (" + purchaseCount + " purchases)";
    }
}
