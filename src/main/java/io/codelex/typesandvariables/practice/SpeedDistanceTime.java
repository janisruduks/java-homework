package io.codelex.typesandvariables.practice;

public class SpeedDistanceTime {
    // Test data
    static final int distanceMeters = 2500;
    static final int hours = 5;
    static final int minutes = 56;
    static final int seconds = 23;
    public static void main(String[] args){

        int everythingToSeconds = seconds + (hours * 60 * 60) + (minutes * 60);
        float metersPerSeconds = (float) distanceMeters / everythingToSeconds;
        System.out.printf("Your speed in meters/second is %.8f%n", metersPerSeconds);

        float everythingToHours = hours + ((float) minutes / 60) + ((float) seconds / 60 / 60);

        float MetersToKilometers = distanceMeters / 1000.0f;
        float kilometersPerHour = MetersToKilometers / everythingToHours;
        System.out.printf("Your speed in km/h is %.8f%n", kilometersPerHour);

        float metersToMiles = (float) distanceMeters / 1609.0f;
        float milesPerHour = metersToMiles / everythingToHours;
        System.out.printf("Your speed in miles/h is %.8f%n", milesPerHour);
    }
}
