package io.codelex.polymorphism.practice.exercise6;

abstract class Feline extends Mammal {

    public Feline(String animalName, String animalType, double animalWeight, String livingRegion, Integer foodEaten) {
        super(animalName, animalType, animalWeight, livingRegion, foodEaten);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
