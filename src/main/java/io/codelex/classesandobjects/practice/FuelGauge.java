package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private int fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public void addFuel() {
        if (this.fuel == 70) {
            showFuel();
            System.out.println("Error: Car can't hold more than 70 liters.");
        } else {
            showFuel();
            this.fuel += 1;
        }
    }

    public void burnFuel() {
        if (this.fuel == 0) {
            System.out.println("Error: Car is out of fuel...");
        } else {
            this.fuel -= 1;
        }
    }

    public int showFuel() {
        return this.fuel;
    }
}
