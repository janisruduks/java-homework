package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class SavingsAccount {
    private double startingBalance;
    private double balance;
    private double totalWithdrawn;
    private double totalDeposited;
    private double interestRate;

    public SavingsAccount(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    private void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    private void withdrawalAmount(double amount) {
        this.totalWithdrawn += amount;
    }

    private void depositAmount(double amount) {
        this.totalDeposited += amount;
    }

    public double getBalance() {
        return balance;
    }

    private double getMonthlyInterestRate(double interestRate) {
        return interestRate / 12;
    }

    private double getInterestEarned() {
        double monthlyInterestRate = getMonthlyInterestRate(interestRate);
        double balance = getBalance() + getTotalDeposited() - getTotalWithdrawn();
        return monthlyInterestRate * balance;
    }

    public double getTotalWithdrawn() {
        return totalWithdrawn;
    }

    public double getTotalDeposited() {
        return totalDeposited;
    }

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public void questionnaire() {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money is in the account?: ");
        setStartingBalance(in.nextDouble());

        System.out.print("Enter the annual interest rate: ");
        setInterestRate(in.nextDouble());

        System.out.print("How long has the account been opened?: ");
        displayEnterAmount(in.nextInt());

        displayTotals();
    }

    private void displayEnterAmount(int months) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= months; i++) {

            System.out.printf("Enter amount deposited for month: %d: ", i);
            depositAmount(in.nextDouble());

            System.out.printf("Enter amount withdrawn for %d: ", i);
            withdrawalAmount(in.nextDouble());
        }

        in.close();
    }

    private void displayTotals() {
        System.out.printf("Total deposited: %.2f%n", getTotalDeposited());
        System.out.printf("Total withdrawn: %.2f%n", getTotalWithdrawn());
        System.out.printf("Interest earned: %.2f", getInterestEarned());
    }
}
