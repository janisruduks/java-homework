package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnimalApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            String animalDetails = keyboard.nextLine();
            if (animalDetails.equalsIgnoreCase("End")) {
                break;
            }
            Animal animal = animalFactory(animalDetails);
            animals.add(animal);
            animal.makeSound();
            String foodDetails = keyboard.nextLine();
            if (foodDetails.equalsIgnoreCase("End")) {
                break;
            }
            animal.eat(foodFactory(foodDetails));
            System.out.println(animal);
        }
        System.out.println(animals.stream()
                .map(Animal::toString)
                .collect(Collectors.joining(", "))
        );
    }

    private static Food foodFactory(String foodDetails) {

        String[] details = foodDetails.split(" ");
        String type = details[0];
        int amount = Integer.parseInt(details[1]);
        return switch (type) {
            case "Meat" -> new Meat(amount);
            case "Vegetable" -> new Vegetable(amount);
            default -> null;
        };
    }

    private static Animal animalFactory(String animalDetails) {

        String[] details = animalDetails.split(" ");
        String type = details[0];
        String name = details[1];
        double weight = Double.parseDouble(details[2]);
        String region = details[3];
        String breed = null;
        if (type.equals("Cat")) {
            breed = details[4];
        }
        return switch (type) {
            case "Cat" -> new Cat(type, name, weight, region, 0, breed);
            case "Tiger" -> new Tiger(type, name, weight, region, 0);
            case "Mouse" -> new Mouse(type, name, weight, region, 0);
            case "Zebra" -> new Zebra(type, name, weight, region, 0);
            default -> null;
        };
    }
}
