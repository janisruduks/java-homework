package io.codelex.oop.shapes;

abstract class Shape3D extends Shape {
    public Shape3D(int numberOfSides) {
        super(numberOfSides);
    }

    abstract double calculateVolume();
}
