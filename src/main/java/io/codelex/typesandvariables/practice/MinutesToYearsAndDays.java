package io.codelex.typesandvariables.practice;

public class MinutesToYearsAndDays {
    public static int MINUTES = 1051920; // 2 years and 0.5 days
    public static void main(String[] args){
        float minutesToHours = (float) MINUTES / 60;
        float hoursToDays = minutesToHours / 24 ;
        float numberOfYears = (hoursToDays / 365);
        float numberOfDays = hoursToDays - (int) numberOfYears * 365;

        String yearsOrYear = "years";
        String daysOrDay = "days";

        if(numberOfYears == 1){
            yearsOrYear = "year";
        }
        if(numberOfDays == 1){
            daysOrDay = "day";
        }

        System.out.printf("You put %d minutes: So it's %d %s and %.2f %s.", MINUTES,
                (int) numberOfYears, yearsOrYear, numberOfDays, daysOrDay);
    }

}
