package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DateIntersection {

    public static void main(String[] args) {

        // This produced pain in my intersection
        // Should return overlaps
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        overlap(firstPeriod.intersection(secondPeriod));

        // Should not return cuz date months don't match.
        LocalDate firstStart1 = LocalDate.of(2023, 4, 1);
        LocalDate firstEnd1 = LocalDate.of(2023, 4, 15);
        DatePeriod firstPeriod1 = new DatePeriod(firstStart1, firstEnd1);

        LocalDate secondStart1 = LocalDate.of(2023, 5, 10);
        LocalDate secondEnd1 = LocalDate.of(2023, 5, 25);
        DatePeriod secondPeriod1 = new DatePeriod(secondStart1, secondEnd1);

        overlap(firstPeriod1.intersection(secondPeriod1));

    }

    private static void overlap(DatePeriod period) {
        if (period == null) {
            System.out.println("Doesn't overlap.");
        } else {
            System.out.println("Overlaps");
            System.out.println(period.getFirstPeriod());
            System.out.println(period.getSecondPeriod());
        }
    }
}
