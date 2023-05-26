package io.codelex.oop.persons;

import java.time.LocalDate;

public class Employee extends Person {

    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        int today = LocalDate.now().getYear();
        return today - startedWorking.getYear();
    }

    @Override
    String getInfo() {
        return position + " - " + getFirstName() + " " + getLastName() + " - (" + getWorkExperience() + " years)";
    }

}
