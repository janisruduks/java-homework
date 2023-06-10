package io.codelex.polymorphism.practice.exercise6;

abstract class Mammal extends Animal {

    protected String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return super.toString()
                + livingRegion
                + ", " + foodEaten;
    }
}
