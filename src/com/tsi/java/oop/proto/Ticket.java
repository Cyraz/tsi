package com.tsi.java.oop.proto;

public class Ticket implements Bookable, Payable {
    final String name;
    final double price;

    public Ticket(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
