package com.tsi.java.practical_three;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " age: " + this.age;
    }
}
