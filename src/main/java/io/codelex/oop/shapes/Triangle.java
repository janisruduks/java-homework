package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        double c = Math.sqrt((base * base) + (height * height));
        return c + height + base;
    }
}
