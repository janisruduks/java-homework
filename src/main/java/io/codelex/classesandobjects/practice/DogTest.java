package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Male", "Lady", "Rocky");
        Dog dog2 = new Dog("Rocky", "Male", "Molly", "Sam");
        Dog dog3 = new Dog("Sparky", "Male");
        Dog dog4 = new Dog("Buster", "Male", "Lady", "Sparky");
        Dog dog5 = new Dog("Sam", "Male");
        Dog dog6 = new Dog("Lady", "Female");
        Dog dog7 = new Dog("Molly", "Female");
        Dog dog8 = new Dog("Coco", "Female", "Molly", "Buster");

        System.out.println(dog8.fathersName());
        System.out.println(dog3.fathersName());
        System.out.println(dog8.hasSameMotherAs(dog2));
    }
}
