package com.tsi.java.whenThingsGoWrong;

public class HandlingErrors {

    // Exceptions
    // Checked and unchecked
    // RuntimeExceptions and others


    int divide(int a, int b) throws CustomException {
        if(b == 0) {
            throw new CustomException("Divide by ZERO!!!");
        }

        return a/b;
    }

    int getItemFromArray(int[] array, int index) {

        if(index >= array.length) {
            throw new CustomUnCheckedException("Index is out of bound");
        }

        System.out.println("Item in array is: " + array[index]);
        return array[index];
    }

}
