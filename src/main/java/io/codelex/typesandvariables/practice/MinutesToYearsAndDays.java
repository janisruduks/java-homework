package io.codelex.typesandvariables.practice;

public class MinutesToYearsAndDays {
    public static void main(String[] args){
        int minutes = 1524022; // 2 years and 0.5 day

        // out put should be 'your input minutes are 2 years and 1 day'
        minutesToYearsAndDays(minutes);
    }
    public static void minutesToYearsAndDays(int inputMinutes){

        float minutesToHours = (float) inputMinutes / 60;
        float hoursToDays = minutesToHours / 24 ;
        float numberOfYears = (hoursToDays / 365);
        float numberOfDays = hoursToDays - (int) numberOfYears * 365;

        String yearsOrYear = "year's";
        String daysOrDay = "day's";

        if(numberOfYears == 1){
            yearsOrYear = "year";
        }
        if(numberOfDays == 1){
            daysOrDay = "day";
        }

        System.out.printf("You put %d minutes: So it's %d %s and %f %s.", inputMinutes,
                (int) numberOfYears, yearsOrYear, numberOfDays, daysOrDay);
    }

}
