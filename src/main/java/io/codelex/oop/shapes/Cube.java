package io.codelex.oop.shapes;

public class Cube extends Shape3D {

    private final double side;

    public Cube(double side) {
        super(6);
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return side * side * side;
    }

    @Override
    public double getArea() {
        System.out.println("We don't do that here.");
        return 0;
    }

    @Override
    public double getPerimeter() {
        System.out.println("We don't do that here.");
        return 0;
    }
}
