package com.pay.desk.models;

public class GoldCard extends Card {

    public GoldCard() {
        super(2.0);
    }

    @Override
    public Double getDiscountRate() {
        Double discountRate = this.getInitialDiscountRate() 
                + Math.floor(this.getTurnover() / 100);
        if (discountRate < 10.0) {
            return discountRate;
        } else {
            return 10.0;
        }
    }

}
