package com.tsi.java.oop.proto;

public class PaymentSystem {

    void pay(Payable payableTicket) {
        if(payableTicket.getPrice() < 0) {
            throw new PaymentException("Negative price ERROR");
        }
        System.out.println("Charging amount: " + payableTicket.getPrice());
    }
}
