package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {

    private int currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 12;
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
        return "Bmw{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
