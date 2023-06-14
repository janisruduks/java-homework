package io.codelex.javaadvanced.bankcards;

import java.math.BigDecimal;

public class DebitCard extends Card {

    private static final BigDecimal HIGHER_LIMIT = new BigDecimal(10000);

    public DebitCard(String cardNumber, String cardOwner, String CCVCode, BigDecimal amount) {
        super(cardNumber, cardOwner, CCVCode, amount);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        try {
            super.addMoney(amount);
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }
        if (this.getAmount().compareTo(HIGHER_LIMIT) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
