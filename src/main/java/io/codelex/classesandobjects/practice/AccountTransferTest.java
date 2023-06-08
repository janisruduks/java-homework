package io.codelex.classesandobjects.practice;

public class AccountTransferTest {
    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000);
        Account randal = new Account("Randal's account", 0);
        Account dave = new Account("Dave's account", 0);

        // so basically money laundering
        transfer(matt, randal, 50.0);
        transfer(randal, dave, 25.0);

        System.out.println(matt);
        System.out.println(randal);
        System.out.println(dave);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
