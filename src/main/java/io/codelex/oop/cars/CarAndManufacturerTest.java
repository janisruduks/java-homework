package io.codelex.oop.cars;

import java.util.List;
import java.util.Objects;

public class CarAndManufacturerTest {
    public static void main(String[] args) {

        Manufacturer porsche = new Manufacturer("Porsche", "Germany", 1948);
        Manufacturer audi = new Manufacturer("Audi", "Germany", 1909);
        Manufacturer bmw = new Manufacturer("BMW", "Germany", 1916);
        Manufacturer mercedes = new Manufacturer("Mercedes-Benz", "Germany", 1926);
        Manufacturer volkswagen = new Manufacturer("Volkswagen", "Germany", 1937);

        List<Manufacturer> mList1 = List.of(porsche);
        List<Manufacturer> mList2 = List.of(audi);
        List<Manufacturer> mList3 = List.of(porsche, audi, bmw);
        List<Manufacturer> mList4 = List.of(audi, mercedes, volkswagen);

        Car car1 = new Car("Cayenne", "Porsche Cayenne", 68000, 2018, mList1, EngineType.V6);
        Car car2 = new Car("911", "Porsche 911 Turbo", 100000, 2022, mList1, EngineType.TURBO);
        Car car3 = new Car("A4", "Audi A4", 45000, 2022, mList2, EngineType.TURBO);
        Car car4 = new Car("M3", "BMW M3", 70000, 2022, mList3, EngineType.V6);
        Car car5 = new Car("E Class", "Mercedes E Class", 55000, 2022, mList1, EngineType.V12);
        Car car6 = new Car("Passat", "Volkswagen Passat", 25000, 1990, mList3, EngineType.V4);
        Car car7 = new Car("Tesla", "t-t-tTeslaMAN", 25000, 1990, mList4, EngineType.V4);
        List<Car> cars = List.of(car1, car2, car3, car4, car5, car6, car7);

        CarService papaJohns = new CarService(cars);

        System.out.println("Cars before sorting");
        System.out.println(papaJohns.getCars());
        System.out.println("After sorting Ascending and Descending");
        papaJohns.sortCars(Car::getPrice, Order.ASCENDING);
        System.out.println(papaJohns.getCars());
        papaJohns.sortCars(Car::getPrice, Order.DESCENDING);
        System.out.println(papaJohns.getCars());


        System.out.println("\nCars with three manufacturers: " + papaJohns.getCarWithThreeManufacturers());
        System.out.println("\nMost expensive car: " + papaJohns.getMostExpensiveCar());
        System.out.println("\nCheapest car: " + papaJohns.getCheapestCar());
        System.out.println("\nCars produced before 1999" + papaJohns.getCarsProducedBefore1999());
        System.out.println("\nCars with V12 Engine" + papaJohns.getCarsWithV12Engine());

        System.out.println("\nIf car exists");
        System.out.println(papaJohns.findCar(car1) + " " + car1);
        System.out.println(papaJohns.findCar(car7) + " " + car7);

        System.out.println("\nCars made by Porsche");
        System.out.println(papaJohns.listCarsBySpecificManufacturer(porsche));

        System.out.println("\nThis should return all cars of manufacturers established in 1909");
        System.out.println(papaJohns.getCarsByManufacturerYear(1909, Objects::equals));
        System.out.println("\nThis should return all cars of manufacturers established after 2000");
        System.out.println(papaJohns.getCarsByManufacturerYear(2000, (year, comparisonYear) -> year > comparisonYear));

        System.out.println("\nremoved tesla car");
        papaJohns.removeCar(car7);
        System.out.println("\nDoes tesla exists in our system?");
        System.out.println(papaJohns.findCar(car7));
        System.out.println("\nLet's add tesla back");
        papaJohns.addCar(car7);
        System.out.println("\nDoes tesla exists in our system?");
        System.out.println(papaJohns.findCar(car7));


    }
}
