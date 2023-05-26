package io.codelex.oop.imperialToMetric;

public class MeasurementConverterTest {
    public static void main(String[] args) {
        double centimeters = 30;
        double inches = ConversionType.CENTIMETERS_TO_INCHES.convert(centimeters);
        System.out.println(inches + " inches");
    }
}
