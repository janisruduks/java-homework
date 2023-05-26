package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(120, 180),
    INTERMEDIATE(80, 119),
    ADVANCED(40, 79);

    private final int minimumRunningTime;
    private final int maximumRunningTime;

    Runner(int minimumRunningTime, int maximumRunningTime) {
        this.minimumRunningTime = minimumRunningTime;
        this.maximumRunningTime = maximumRunningTime;
    }

    static Runner getFitnessLevel(int time) {
        for (Runner runner : values()) {
            if (time >= runner.minimumRunningTime && time <= runner.maximumRunningTime) {
                return runner;
            }
        }
        return BEGINNER;
    }
}
