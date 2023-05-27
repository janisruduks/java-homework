package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class OfficeEmployeeWorkHours {
    private static final int WORK_HOURS = 8;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to office worker hour calculator!");
        System.out.println("Please enter start date year/month/day in such format.");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate startDate = LocalDate.parse(keyboard.nextLine(), formatter);

        System.out.println("Please enter end date year/month/day in such format.");
        LocalDate endDate = LocalDate.parse(keyboard.nextLine(), formatter);

        int workingDays = calculateWorkingDays(startDate, endDate);
        System.out.println("Number of hours I was debugging this code in the office - "
                + workingDays * WORK_HOURS + "h");
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