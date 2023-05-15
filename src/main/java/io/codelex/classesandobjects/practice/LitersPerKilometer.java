package io.codelex.classesandobjects.practice;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        Car car = new Car(startKilometers);

        car.fillUp(100, 30);
        System.out.printf("Your fuel consumption is %.2f L/100km%n", car.calculateConsumption());
        car.fillUp(200, 40);
        System.out.printf("Your fuel consumption is %.2f L/100km%n", car.calculateConsumption());
        car.fillUp(300, 20);


        System.out.printf("Your fuel consumption is %.2f L/100km%n", car.calculateConsumption());
        if (car.gasHog()) {
            System.out.println("Your car is a gas hog");
        } else if (car.economyCar()) {
            System.out.println("Your car is a economic, congrats.");
        }
    }
}