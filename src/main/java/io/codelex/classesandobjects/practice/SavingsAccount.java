package io.codelex.classesandobjects.practice;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;
    private double totalDeposited = 0;
    private double totalWithdrawn = 0;
    private double totalInterestEarned = 0;

    public SavingsAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public void withdraw(double amount) {
        balance -= amount;
        totalWithdrawn += amount;
    }

    public void deposit(double amount) {
        balance += amount;
        totalDeposited += amount;
    }

    public void addMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
        totalInterestEarned += monthlyInterest;
    }

    public double getTotalDeposited() {
        return totalDeposited;
    }

    public double getTotalWithdrawn() {
        return totalWithdrawn;
    }

    public double getTotalInterestEarned() {
        return totalInterestEarned;
    }

    public double getBalance() {
        return balance;
    }
}
