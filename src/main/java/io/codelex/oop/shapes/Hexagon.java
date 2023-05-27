package io.codelex.oop.shapes;

public class Hexagon extends Shape {

    private final double length;

    public Hexagon(double length) {
        super(6);
        this.length = length;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) * (length * length)) / 2;
    }

    @Override
    public double getPerimeter() {
        return length * getNumberOfSides();
    }
}
