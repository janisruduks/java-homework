package io.codelex.additional_exercises.employee;

import java.time.LocalDate;

public class EmployeeTes {
    public static void main(String[] args) {
        LocalDate bobDate = LocalDate.of(2021, 4, 14);
        Employee bob = new Employee("Bob Davis", 130000, bobDate);
        System.out.println(
                "Our favorite employee " + bob.getName()
                        + " has worked in this company for " + bob.yearsOfService() + " years"
        );
    }
}
