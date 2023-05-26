package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public double convert(int value, ConversionType conversionType) {
        return conversionType.convert(value);
    }
}
