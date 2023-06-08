package io.codelex.classesandobjects.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money is in the account?: ");
        SavingsAccount account = new SavingsAccount(in.nextDouble());

        System.out.print("Enter the annual interest rate: ");
        account.setAnnualInterestRate(in.nextDouble());

        System.out.print("How long has the account been opened? ");
        int repeat = in.nextInt();
        for (int i = 1; i <= repeat; i++) {
            System.out.printf("Enter amount deposited for month %d: ", i);
            account.deposit(in.nextDouble());

            System.out.printf("Enter amount withdrawn for %d: ", i);
            account.withdraw(in.nextDouble());

            account.addMonthlyInterest();
        }

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Total deposited: " + currency.format(account.getTotalDeposited()));
        System.out.println("Total withdrawn: " + currency.format(account.getTotalWithdrawn()));
        System.out.println("Interest earned: " + currency.format(account.getTotalInterestEarned()));
        System.out.println("Ending balance: " + currency.format(account.getBalance()));
    }
}
