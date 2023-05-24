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
        System.out.println("Server must be updated on - " + nextServerUpdate(serverStartingDate));

    }

    private static LocalDate nextServerUpdate(LocalDate serverStartingDate) {
        return serverStartingDate.plusDays(SERVER_CHECK_DAYS);
    }
}
