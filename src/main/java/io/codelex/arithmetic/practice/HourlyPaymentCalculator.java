package io.codelex.arithmetic.practice;

public class HourlyPaymentCalculator {
    public static void main(String[] args){
        basePayRateCalculator(7.50, 35);
        basePayRateCalculator(8.20, 47);
        basePayRateCalculator(10.00, 73);
    }

    public static void basePayRateCalculator(double wageAnHour, int hoursWorked){
        double minimumWage = 8.00;
        if(minimumWage > wageAnHour){
            System.out.println("Error: Employee wage is bellow minimum wage, which is $8.00.");
            return;
        }else if(hoursWorked > 60){
            System.out.println("Error: Employee is not a slave. Hours worked should not be higher than 60");
            return;
        }
        int hourOverLimit = 40;
        double overtimePay = 0.00;
        if(hoursWorked > hourOverLimit){
           overtimePay = (hoursWorked - hourOverLimit) * (wageAnHour * 1.5);
           hoursWorked = hourOverLimit;
        }

        double wage = wageAnHour * hoursWorked + overtimePay;
        System.out.printf("$%.2f%n", wage);
    }
}