package com.tsi.java.oop.proto;

public class BookingSystem {

    void book(Bookable bookableTicket) {
        System.out.println("Reserving seat for " + bookableTicket.getName());
    }
}
