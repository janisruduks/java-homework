package io.codelex.oop.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(32, 41);
        System.out.println("Triangle area is: " + triangle.getArea());
        System.out.println("triangle perimeter is: " + triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(15, 11);
        System.out.println("Rectangle area is: " + rectangle.getArea());
        System.out.println("Rectangle perimeter is: " + rectangle.getPerimeter());

        Hexagon hexagon = new Hexagon(5);
        System.out.println("Hexagon area is: " + hexagon.getArea());
        System.out.println("Hexagon perimeter is: " + hexagon.getPerimeter());

        Cone cone = new Cone(20, 10);
        System.out.println("Cone volume is: " + cone.calculateVolume());

        Cube cube = new Cube(12);
        System.out.println("Cube volume is: " + cube.calculateVolume());
    }
}
