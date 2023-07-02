package io.codelex.classesandobjects.practice;

import java.awt.*;

public class swapPoint {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    private static void swapPoints(Point p1, Point p2) {
        int x = p1.x;
        int y = p1.y;
        p1.move(p2.x, p2.y);
        p2.move(x, y);
    }
}
