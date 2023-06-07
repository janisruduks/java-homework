package io.codelex.polymorphism.practice.exercise1;

public class Volga implements Car {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 5;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 5;
    }

    @Override
    public void startEngine() {
        System.out.println("Rumble-growl-vroom-vroom... Prrrrrrrrrrrrrrrrrrr...");
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Volga{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
