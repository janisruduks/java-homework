package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class ServerTimeUpdate {
    private static final int SERVER_CHECK_DAYS = 14;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter server date start.");
        System.out.print("Year : ");
        int year = in.nextInt();
        System.out.print("Month : ");
        int month = in.nextInt();
        System.out.print("Day : ");
        int day = in.nextInt();

        LocalDate serverStartingDate = LocalDate.of(year, month, day);
        LocalDate nextServerUpdate = nextServerUpdate(serverStartingDate);
        System.out.println("Server must be updated on - " + nextServerUpdate);

        LocalDate nextUpdateInSameMonth = nextUpdateInSameMonth(nextServerUpdate);
        if (nextServerUpdate.isEqual(nextUpdateInSameMonth)) {
            System.out.println("Server will not need any more updates this month");
        } else {
            System.out.print("Server should be update second time this month - ");
            System.out.println(nextUpdateInSameMonth);
        }

    }

    private static LocalDate nextServerUpdate(LocalDate serverStartingDate) {
        return serverStartingDate.plusDays(SERVER_CHECK_DAYS - 1);
    }

    private static LocalDate nextUpdateInSameMonth(LocalDate serverPreviousUpdate) {
        LocalDate serverNextUpdate = nextServerUpdate(serverPreviousUpdate);
        if (serverNextUpdate.getMonthValue() == serverPreviousUpdate.getMonthValue()) {
            return serverNextUpdate;
        }
        return serverPreviousUpdate;
    }
}
