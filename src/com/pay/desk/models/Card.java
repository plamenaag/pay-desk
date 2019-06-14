package com.pay.desk.models;

public abstract class Card {

    private User owner;
    private Double turnover;
    private Double initialDiscountRate;

    public Card(Double initialDiscountRate) {
        this.initialDiscountRate = initialDiscountRate;
        this.turnover = 0.0;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Double getTurnover() {
       return this.turnover;
    }
   
    public void setTurnover(Double turnover) {
       this.turnover = turnover;
    }

    public Double getInitialDiscountRate() {
        return initialDiscountRate;
    }

    public abstract Double getDiscountRate();

}
