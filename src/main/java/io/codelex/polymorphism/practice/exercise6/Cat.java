package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {

    String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, Integer foodEaten, String breed) {
        super(animalName, animalType, animalWeight, livingRegion, foodEaten);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat(Food food) {
        foodEaten += food.quantity;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + breed + "]";
    }
}
