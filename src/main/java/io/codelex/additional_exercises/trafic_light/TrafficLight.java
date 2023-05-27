package io.codelex.additional_exercises.trafic_light;

public class TrafficLight {
    private String color;
    private final String COLOR_GREEN = "GREEN";
    private final String COLOR_RED = "RED";
    private final int DURATION;

    public TrafficLight(String color, int duration) {
        this.color = color.toUpperCase();
        this.DURATION = duration;
    }

    public void changeColor(String newColor) {
        if (!isGreen() && !isRed()) {
            System.out.println("Incorrect color... Setting to default green.");
            color = COLOR_GREEN;
        } else {
            color = newColor;
        }
    }

    public int getDuration() {
        return DURATION;
    }

    public String getColor() {
        return color;
    }

    public boolean isRed() {
        return color.equals(COLOR_RED);
    }

    public boolean isGreen() {
        return color.equals(COLOR_GREEN);
    }
}
