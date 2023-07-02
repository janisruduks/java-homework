package io.codelex.oop.imperialToMetric;

public enum ConversionType {

    METERS_TO_YARDS(input -> input * 1.09361),
    YARDS_TO_METERS(input -> input / 1.09361),
    CENTIMETERS_TO_INCHES(input -> input / 2.54),
    INCHES_TO_CENTIMETERS(input -> input * 2.54),
    KILOMETERS_TO_MILES(input -> input * 0.621371),
    MILES_TO_KILOMETERS(input -> input / 0.621371);

    private final Converter converter;


    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public double convert(double input) {
        return converter.convert(input);
    }
}
