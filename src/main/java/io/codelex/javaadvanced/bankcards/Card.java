package io.codelex.javaadvanced.bankcards;

import java.math.BigDecimal;

abstract class Card {

    private String cardNumber;
    private String cardOwner;
    private String CCVCode;
    private BigDecimal amount;

    public Card(String cardNumber, String cardOwner, String CCVCode, BigDecimal amount) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.CCVCode = CCVCode;
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
        return CCVCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
