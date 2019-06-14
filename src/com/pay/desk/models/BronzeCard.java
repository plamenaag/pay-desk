package com.pay.desk.models;

public class BronzeCard extends Card {

    public BronzeCard() {
        super(0.0);
    }

    @Override
    public Double getDiscountRate() {
        Double turnover = this.getTurnover();
        if (turnover < 100) {
            return this.getInitialDiscountRate();
        } else if (turnover >= 100 && turnover <= 300) {
            return 1.0;
        } else {
            return 2.5;
        }
    }
}
