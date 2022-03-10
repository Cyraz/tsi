package com.tsi.java;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class Arrays {

    public void playWithArrays() {
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new Random().nextInt(0, 100);
        }

        // print array values using streams
        java.util.Arrays.stream(myArray)
                .forEach(value -> System.out.print(value + " "));

        // fnd min, max and avg
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int sum = 0;
        double avg;
        for (int i = 0; i < myArray.length; i++) {

            int current = myArray[i];
            if(min > current) {
                min = current;
            }

            if(max < current) {
                max = current;
            }

            sum += current;
        }

        System.out.println("\n========= MIN, MAX and AVG =============");
        System.out.printf("Min value is %d and Max value is %d", min, max);
        System.out.printf("\nAverage is %d", (sum/ myArray.length));

    }

    public static void main(String[] args) {
        Arrays arrays = new Arrays();

        arrays.playWithArrays();
    }
}
