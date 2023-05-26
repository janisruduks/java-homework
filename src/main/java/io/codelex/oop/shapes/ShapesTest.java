package io.codelex.oop.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(32, 41);
        System.out.println("Triangle area is: " + triangle.getArea());
        System.out.println("triangle perimeter is: " + triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(15, 11);
        System.out.println("Rectangle area is: " + rectangle.getArea());
        System.out.println("Rectangle perimeter is: " + rectangle.getPerimeter());
    }
}
