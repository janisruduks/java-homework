package io.codelex.oop.cars;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private String country;
    private int creationYear;

    public Manufacturer(String name, String country, int creationYear) {
        this.name = name;
        this.country = country;
        this.creationYear = creationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return creationYear == that.creationYear && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, creationYear);
    }

    @Override
    public String toString() {
        return "\n  Manufacturer: " + name
                + " - " + country
                + " - " + creationYear;
    }
}
