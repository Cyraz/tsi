package com.tsi.java.whenThingsGoWrong;

import java.util.Arrays;

public class Test {

    public static void main(String... args) {
        var h = new HandlingErrors();

        int[] array = new int[]{1,2,3,4,5};

        h.getItemFromArray(array, 2);


        try {
            h.divide(10, 0);
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }
}
