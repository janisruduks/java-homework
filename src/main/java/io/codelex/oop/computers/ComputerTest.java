package io.codelex.oop.computers;

public class ComputerTest {
    public static void main(String[] args) {
        Computer pc1 = new Computer(
                "AMD Ryzen 7 5700X", "16GB",
                "Nvidia RTX3050", "Gigabyt", "Custom"
        );
        Computer pc2 = new Computer(
                "AMD Ryzen™ 5 3600", "32GB",
                "Nvidia GeForce GTX 1650", "Intop", "RM18198NS"
        );

        System.out.println(pc1);
        System.out.println(pc2);

        Laptop laptop1 = new Laptop(
                "Apple M2 (8 cores)", "8GB", "M2 8-Core",
                "Apple", "MLY33ZE/A/US", "A2337 Late 2020"
        );

        Laptop laptop2 = new Laptop(
                "AMD Ryzen 7 7730U", "16GB", "AMD Radeon",
                "Asus", "UM3402YA-KM454W", "75Wh"
        );

        System.out.println(laptop1);
        System.out.println(laptop2);


    }
}
