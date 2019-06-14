package com.pay.desk.models;

public class SilverCard extends Card {

    public SilverCard() {
        super(2.0);
    }

    @Override
    public Double getDiscountRate() {
        if (this.getTurnover() > 300) {
            return 3.5;
        } else {
            return this.getInitialDiscountRate();
        }
    }
}
