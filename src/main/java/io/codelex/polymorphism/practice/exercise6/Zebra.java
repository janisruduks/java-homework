package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion, Integer foodEaten) {
        super(animalName, animalType, animalWeight, livingRegion, foodEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("*Some horse sounds idk*");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.quantity;
        } else {
            System.out.println(
                    getClass().getSimpleName() + " are not eating that type of food!"
            );
        }
    }

    @Override
    public String toString() {
        return super.toString() + "]";
    }
}
