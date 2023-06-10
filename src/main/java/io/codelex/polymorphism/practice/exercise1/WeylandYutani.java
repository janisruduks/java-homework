package io.codelex.polymorphism.practice.exercise1;

public class WeylandYutani implements Car, Boost {

    private Integer currentSpeed = 0;

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 150;
    }

    @Override
    public void speedUp() {
        currentSpeed += 40;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 40;
    }

    @Override
    public void startEngine() {
        System.out.println("Vroooomm... Whirrrrrrrr...");
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "WeylandYutani{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
