package io.codelex.classesandobjects.practice;

public class Odometer {

    private final FuelGauge fuelGauge;
    private int mileage;

    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public void addMileage() {
        if (this.mileage == 999_999) {
            this.mileage = 0;
        } else {
            if (fuelGauge.showFuel() > 0) {
                this.mileage += 1;
                decreaseFuel();
            }
        }
    }

    private void decreaseFuel() {
        if (mileage % 10 == 0) {
            fuelGauge.burnFuel();
        }
    }

    public int showMileage() {
        return this.mileage;
    }

}