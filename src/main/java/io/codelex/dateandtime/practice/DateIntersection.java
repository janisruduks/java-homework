package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DateIntersection {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        // this produced pain in my intersection
        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        System.out.println(overlap.getFirstPeriod());
        System.out.println(overlap.getSecondPeriod());
    }
}
