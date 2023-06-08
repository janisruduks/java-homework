package io.codelex.classesandobjects.practice;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.name = "Benson";
        user.balance = -17.5;
        user.deposit(10);
        user.withdraw(5);
        System.out.println(user);
    }
}
