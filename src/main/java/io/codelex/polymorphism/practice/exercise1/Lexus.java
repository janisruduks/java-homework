package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Boost {

    private int currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 8;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
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
        return "Lexus{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
