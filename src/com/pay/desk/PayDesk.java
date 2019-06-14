package com.pay.desk;

import com.pay.desk.models.BronzeCard;
import com.pay.desk.models.Card;
import com.pay.desk.models.GoldCard;
import com.pay.desk.models.SilverCard;

public class PayDesk {

    public static void makePurchase(Double amount, Card card) {
        Double discountRate = card.getDiscountRate();
        Double discount = amount * (discountRate / 100);
        Double total = amount - discount;

        System.out.println("Purchase value: $" + amount);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.printf("Discount $%.2f \n", discount);
        System.out.println("Total: $" + total);
    }

    public static void main(String[] args) {

        System.out.println("Bronze:");
        Card bronzeCard = new BronzeCard();
        bronzeCard.setTurnover(0.0);
        makePurchase(150.0, bronzeCard);
        System.out.println();

        System.out.println("Silver:");
        Card silverCard = new SilverCard();
        silverCard.setTurnover(600.0);
        makePurchase(850.0, silverCard);
        System.out.println();

        System.out.println("Gold:");
        Card goldCard = new GoldCard();
        goldCard.setTurnover(1500.0);
        makePurchase(1300.0, goldCard);
    }

}
