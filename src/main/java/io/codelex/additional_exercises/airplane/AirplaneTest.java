package io.codelex.additional_exercises.airplane;

import java.time.LocalDate;

public class AirplaneTest {
    public static void main(String[] args) {
        LocalDate toMoldova = LocalDate.of(2023, 5, 30);
        Airplane airplane = new Airplane("AS24", "Moldova", toMoldova);
        airplane.checkDelay();
        airplane.checkFlightStatus();
        airplane.addDelay(3);
        airplane.checkFlightStatus();
        System.out.println("Is airplane delayed " + airplane.checkDelay());

        LocalDate toFrance = LocalDate.of(2023, 5, 24);
        Airplane airplane2 = new Airplane("BS67", "France", toFrance);
        airplane2.checkFlightStatus();
    }
}
