package io.codelex.additional_exercises.employee;

import java.time.LocalDate;

public class Employee {
    private final String name;
    private final double salary;
    private final LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public int yearsOfService() {
        LocalDate now = LocalDate.now();
        return now.getYear() - hireDate.getYear();
    }
}
