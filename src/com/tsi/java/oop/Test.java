package com.tsi.java.oop;

public class Test {

    public static void main(String... args) {
        Animal a1 = new Dog("SomeDoggo");
        a1.speak();
        a1.eat();
        a1.walk();


        Dog dog = new Dog("GuardDoggo");

        dog.guard();

    }
}
