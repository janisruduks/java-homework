package io.codelex.oop.shapes;

public class Cone extends Shape3D {

    private double height;
    private double radius;

    public Cone(double height, double radius) {
        super(2);
        this.height = height;
        this.radius = radius;
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

    @Override
    double calculateVolume() {
        return (1.0 / 3) * Math.PI * (radius * radius) * height;
    }
}
