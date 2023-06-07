package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {

    public static void main(String[] args) {

        Employee steve = new Employee(
                "Steve", "Lord",
                "900 Beechwood Avenue", 42359,
                "Engineer");

        Student lester = new Student("Lester", "Parker",
                "3362 Stadium Drive", 25544,
                3.7);

        steve.display();
        lester.display();
    }

}
