package io.codelex.oop.imperialToMetric;

public class MeasurementConverterTest {
    public static void main(String[] args) {
        double centimeters = 30;
        double inches = MeasurementConverter.convert(centimeters, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(inches + " inches");
    }
}
