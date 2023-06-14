package io.codelex.javaadvanced.bankcards;

import java.math.BigDecimal;

public class CardTest {

    public static void main(String[] args) throws NotEnoughFundsException {

        CreditCard creditCard = new CreditCard("4444-4444", "Janis Berzins", "031", new BigDecimal(50));
        DebitCard debitCard = new DebitCard("4444-4441", "Edgars Berzins", "041", new BigDecimal(10000));

        debitCard.addMoney(new BigDecimal(100));
        System.out.println(debitCard.getAmount());

        creditCard.takeMoney(BigDecimal.valueOf(25));
        System.out.println(creditCard.getAmount());

        creditCard.takeMoney(BigDecimal.valueOf(26));


    }

}
