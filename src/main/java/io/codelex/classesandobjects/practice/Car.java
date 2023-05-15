package io.codelex.classesandobjects.practice;

public class Car {
    private final double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    void fillUp(int mileage, double liters) {
        this.liters += liters;
        this.endKilometers += mileage;
    }

    double calculateConsumption() {
        double distanceTraveled = this.endKilometers - this.startKilometers;
        return (this.liters * 100) / distanceTraveled;
    }

    boolean gasHog() {
        double consumption = calculateConsumption();
        return consumption > 15;
    }

    boolean economyCar() {
        double consumption = calculateConsumption();
        return consumption < 5;
    }
}
