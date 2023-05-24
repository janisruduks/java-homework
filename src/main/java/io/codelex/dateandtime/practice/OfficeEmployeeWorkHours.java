package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class OfficeEmployeeWorkHours {
    private static final int HOURS_WORK_A_DAY = 8;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to office worker hour calculator!");
        System.out.println("Please enter start date year/month/day in such format.");
        int[] start = formatInputDates(keyboard);
        LocalDate startDate = LocalDate.of(start[0], start[1], start[2]);

        System.out.println("Please enter end date year/month/day in such format.");
        int[] end = formatInputDates(keyboard);
        LocalDate endDate = LocalDate.of(end[0], end[1], end[2]);

        int workingDays = calculateWorkingDays(startDate, endDate);
        System.out.println("Number of hours I was debugging this code in the office - "
                + workingDays * HOURS_WORK_A_DAY + "h");
    }

    private static int[] formatInputDates(Scanner keyboard) {
        String[] dateValues = keyboard.nextLine().split("/");
        int[] numberFormatDates = new int[3];
        for (int i = 0; i < dateValues.length; i++) {
            numberFormatDates[i] = Integer.parseInt(dateValues[i]);
        }
        return numberFormatDates;
    }

    public static int calculateWorkingDays(LocalDate startDate, LocalDate endDate) {
        int workingDays = 0;
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            if (isWorkingDay(currentDate)) {
                workingDays++;
            }
            currentDate = currentDate.plusDays(1);
        }
        return workingDays;
    }

    public static boolean isWorkingDay(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }
}