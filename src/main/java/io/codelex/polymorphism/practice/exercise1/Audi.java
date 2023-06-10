package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {

    private int currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 10;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
