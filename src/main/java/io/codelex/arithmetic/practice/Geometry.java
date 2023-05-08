package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal radiusSquared = radius.pow(2);
        BigDecimal area = pi.multiply(radiusSquared);
        return area.doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        BigDecimal area = length.multiply(width);
        return area.doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal height) {
        BigDecimal area = base.multiply(height);
        BigDecimal coefficient = new BigDecimal("0.5");
        return area.multiply(coefficient).doubleValue();
    }
}
