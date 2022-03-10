package com.tsi.java.oop;

public class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void speak() {
        System.out.printf("%s noises\n", name);
    }

    protected void eat() {
        System.out.printf("%s eating food\n", name);
    }

    protected void walk() {
        System.out.printf("%s is walking\n", name);
    }
}
