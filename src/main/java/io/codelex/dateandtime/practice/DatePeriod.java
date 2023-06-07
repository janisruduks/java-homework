package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod { // what is record?

    private final LocalDate firstPeriod;
    private final LocalDate secondPeriod;

    public DatePeriod(LocalDate firstPeriod, LocalDate secondPeriod) {
        this.firstPeriod = firstPeriod;
        this.secondPeriod = secondPeriod;
    }

    public DatePeriod intersection(DatePeriod period) {
        if (doOverlap(period)) {
            return new DatePeriod(getOverlapStart(period), getOverlapEnd(period));
        } else {
            return null;
        }
    }

    private LocalDate getOverlapStart(DatePeriod period) {
        if (period.firstPeriod.isAfter(firstPeriod)) {
            return period.firstPeriod;
        } else {
            return firstPeriod;
        }
    }

    private LocalDate getOverlapEnd(DatePeriod period) {
        if (period.secondPeriod.isBefore(secondPeriod)) {
            return period.secondPeriod;
        } else {
            return secondPeriod;
        }
    }

    private boolean doOverlap(DatePeriod period) {
        return !(period.getFirstPeriod().isAfter(this.secondPeriod)
                || period.getSecondPeriod().isBefore(this.firstPeriod));
    }

    public LocalDate getFirstPeriod() {
        return firstPeriod;
    }

    public LocalDate getSecondPeriod() {
        return secondPeriod;
    }
}
