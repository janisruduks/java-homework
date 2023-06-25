package io.codelex.javaadvanced.bankcards;

import java.math.BigDecimal;

abstract class Card {

    private final String cardNumber;
    private final String cardOwner;
    private final String ccv;
    private BigDecimal amount;

    public Card(String cardNumber, String cardOwner, String CCVCode, BigDecimal amount) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.ccv = CCVCode;
        this.amount = amount;
    }

    public void addMoney(BigDecimal amount) throws NotEnoughFundsException {
        this.amount = this.amount.add(amount);
    }

    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (this.amount.compareTo(amount) < 0) {
            throw new NotEnoughFundsException();
        } else {
            this.amount = this.amount.subtract(amount);
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public String getCCVCode() {
        return ccv;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
