package io.codelex.javaadvanced.bankcards;

import java.math.BigDecimal;

public class CreditCard extends Card {

    private static final BigDecimal LOWER_LIMIT = new BigDecimal(100);

    public CreditCard(String cardNumber, String cardOwner, String CCVCode, BigDecimal amount) {
        super(cardNumber, cardOwner, CCVCode, amount);
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        super.takeMoney(amount);
        if (LOWER_LIMIT.compareTo(getAmount()) > 0) {
            System.out.println("Warning: Low funds");
        }
    }
}
