package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    final static int NUMBER_SURVEYED = 12467;
    final static double PURCHASED_ENERGY_DRINKS = 0.14;
    final static double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        double energyDrinkers = calculateEnergyDrinkers(NUMBER_SURVEYED);
        double preferCitrus = calculatePreferCitrus((int) energyDrinkers);
        //fixme
        System.out.println("Total number of people surveyed " + NUMBER_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        return numberSurveyed * PREFER_CITRUS_DRINKS;
    }
}
