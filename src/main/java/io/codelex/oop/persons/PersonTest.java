package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1206, 2, 13);
        Employee employee = new Employee("Genghis", "Khan",
                "EBC1342LS", 24, "Leader of the Mongol Empire", date);
        System.out.println(employee.getInfo());


        Customer customer = new Customer("Elon", "Musk",
                "ZXEM12310", 51, 3);

        System.out.println(customer.getInfo());

    }
}
