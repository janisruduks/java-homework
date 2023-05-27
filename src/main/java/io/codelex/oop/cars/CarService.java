package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class CarService {
    private List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    private List<Manufacturer> listAllManufacturers() {
        return cars.stream()
                .map(Car::getManufacturerList)
                .flatMap(List::stream)
                .toList();
    }

    public List<Car> listCarsBySpecificManufacturer(Manufacturer manufacturer) {
        List<Car> listOfCarsByManufacturers = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturerList().contains(manufacturer)) {
                listOfCarsByManufacturers.add(car);
            }
        }
        return listOfCarsByManufacturers;
    }

    public boolean findCar(Car carToFind) {
        return cars.stream()
                .anyMatch(car -> car.equals(carToFind));
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .toList();
    }

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .toList();
    }

    public List<Car> getCarWithThreeManufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .toList();
    }

    public <T extends Comparable<T>> List<Car> sortCars(Function<Car, T> KeyExtractor, Order order) {
        Comparator<Car> comparator = Comparator.comparing(KeyExtractor);
        if (order == Order.DESCENDING) {
            comparator = comparator.reversed();
        }
        cars.sort(comparator);
        return cars;
    }

    public List<Car> getCarsByManufacturerYear(int year, BiPredicate<Integer, Integer> comparator) {
        List<Manufacturer> filteredManufacturers = listAllManufacturers().stream()
                .filter(m -> comparator.test(m.getCreationYear(), year))
                .toList();

        return cars.stream()
                .filter(car -> car.getManufacturerList().stream().anyMatch(filteredManufacturers::contains))
                .toList();
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }
}
