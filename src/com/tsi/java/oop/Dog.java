package com.tsi.java.oop;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void speak() {
        System.out.printf("%s Woof Woof..\n", name);
    }

    public void guard() {
        System.out.printf("%s Guarding the house", name);
    }
}
