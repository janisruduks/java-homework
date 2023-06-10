package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion, Integer foodEaten) {
        super(animalName, animalType, animalWeight, livingRegion, foodEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            foodEaten += food.quantity;
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "]";
    }
}
