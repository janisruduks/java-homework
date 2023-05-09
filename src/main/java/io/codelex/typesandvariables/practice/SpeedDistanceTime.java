package io.codelex.typesandvariables.practice;

public class SpeedDistanceTime {
    // Test data
    static final int DISTANCE_METERS = 2500;
    static final int HOURS = 5;
    static final int MINUTES = 56;
    static final int SECONDS = 23;

    public static void main(String[] args) {

        int everythingToSeconds = SECONDS + (HOURS * 60 * 60) + (MINUTES * 60);
        float metersPerSeconds = (float) DISTANCE_METERS / everythingToSeconds;
        System.out.printf("Your speed in meters/second is %.8f%n", metersPerSeconds);

        float everythingToHours = HOURS + ((float) MINUTES / 60) + ((float) SECONDS / 60 / 60);

        float MetersToKilometers = DISTANCE_METERS / 1000.0f;
        float kilometersPerHour = MetersToKilometers / everythingToHours;
        System.out.printf("Your speed in km/h is %.8f%n", kilometersPerHour);

        float metersToMiles = (float) DISTANCE_METERS / 1609.0f;
        float milesPerHour = metersToMiles / everythingToHours;
        System.out.printf("Your speed in miles/h is %.8f%n", milesPerHour);
    }
}
