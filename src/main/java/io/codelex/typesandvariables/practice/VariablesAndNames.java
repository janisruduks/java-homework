package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars = 100;
        int carSeats = 4;
        int drivers = 30;
        int passengers = 90;
        int emptyCars = cars - drivers;
        int carpoolCapacity = drivers * carSeats;
        double averagePassengersPerCar = (double) passengers / drivers;

        // We can use Cc.textColour()
        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + emptyCars + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.printf("We need to put about %.2f in each car.%n", averagePassengersPerCar);
    }
}