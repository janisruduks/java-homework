package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {

    private int currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 20;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 20;
    }

    @Override
    public void startEngine() {
        System.out.println("-- silence ---");
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
