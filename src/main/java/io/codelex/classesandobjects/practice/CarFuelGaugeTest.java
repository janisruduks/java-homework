package io.codelex.classesandobjects.practice;

public class CarFuelGaugeTest {
    public static void main(String[] args) {
        FuelGauge gauge = new FuelGauge(70);
        Odometer driving = new Odometer(0, gauge);

        for (int i = 0; i < 701; i++) {
            driving.addMileage();
            System.out.println(driving.showMileage() + " km mileage");
            System.out.println("Cars current fuel is: " + gauge.showFuel());
        }
        // refuel
        for (int i = 0; i < 15; i++) {
            gauge.addFuel();
            System.out.println("Filling up." + ".".repeat(gauge.showFuel() + gauge.showFuel()));
        }

        driving.addMileage();
        System.out.println(driving.showMileage() + " km mileage");
        System.out.println("Cars current fuel is: " + gauge.showFuel());

    }
}
