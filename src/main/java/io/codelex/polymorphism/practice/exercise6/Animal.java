package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

abstract class Animal {

    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    public Animal(String animalType, String animalName, double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        String formattedWeight = format.format(animalWeight);
        return animalType + '['
                + animalName + ", "
                + formattedWeight + ", ";
    }
}
