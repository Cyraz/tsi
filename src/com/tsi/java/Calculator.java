package com.tsi.java;

/**
 * x (t) = (t ^ 2) * a * 0.5 + v0 * t + x0
 */
public class Calculator {

    // Constants
    public static final double GRAVITY_CONSTANT = 9.8;
    public static final double ANOTHER_CONSTANT = 0.5;

    int fallingTime = 0;
    double initialPosition = 0;
    double initialVelocity = 0;

    // Default constructor
    public Calculator() {
    }

    // parameterized constructor
    public Calculator(int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

    public void calculate() {
        double finalPosition = (fallingTime * fallingTime)
                * (GRAVITY_CONSTANT * ANOTHER_CONSTANT)
                + (initialVelocity * fallingTime)
                + initialPosition;

        System.out.println("Position in " + fallingTime + " seconds:" + finalPosition);
    }

}
