package io.codelex.enums.practice;

public enum Direction {
    NORTH("up", "North"),
    SOUTH("down", "South"),
    EAST("right", "East"),
    WEST("left", "West");

    private final String name;
    private final String text;

    Direction(String text, String name) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return name + ":" + text + ":" + ordinal();
    }
}

