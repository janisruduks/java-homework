package io.codelex.additional_exercises.airplane;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Airplane {
    private final String flightNumber;
    private final String destination;

    private boolean delay = false;
    private LocalDate departure;

    public Airplane(String flightNumber, String destination, LocalDate departure) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
    }

    public void checkFlightStatus() {
        LocalDate now = LocalDate.now();
        long days = now.until(departure, ChronoUnit.DAYS);
        if (days < -1) {
            System.out.println("Plane with number " + flightNumber + " has departed");
        } else {
            System.out.println(days + " days until departure, destination " + destination);
        }
    }

    public void addDelay(int days) {
        departure = departure.plusDays(days);
        delay = true;
    }

    public boolean checkDelay() {
        return delay;
    }
}
