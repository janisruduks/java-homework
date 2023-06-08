package io.codelex.classesandobjects.practice;

public class AccountCreateTest {
    public static void main(String[] args) {
        Account account = new Account("Xorg account", 100.0);
        account.deposit(20.0);
        System.out.println(account);
    }
}
