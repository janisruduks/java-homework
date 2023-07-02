package io.codelex.oop.cars;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int price;
    private int productionYear;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String name, String model, int price, int productionYear, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && productionYear == car.productionYear && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturerList, car.manufacturerList) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, productionYear, manufacturerList, engineType);
    }

    @Override
    public String toString() {
        return "\n Car:" + name
                + " - Model:" + model
                + " - Price: $" + price
                + " - Production Year: " + productionYear
                + " - Engine Type: " + engineType;
    }
}
