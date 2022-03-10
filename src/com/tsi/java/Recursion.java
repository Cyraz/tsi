package com.tsi.java;

public class Recursion {


    /**
     * call[recursion with value 10] pending
     * -> call[recursion with value 9] pending
     * -> call[recursion with value 8] pending
     * -> call[recursion with value 7] pending
     * -> call[recursion with value 6] pending
     * -> call[recursion with value 5] pending
     * -> call[recursion with value 4] pending
     * -> call[recursion with value 3] pending
     * -> call[recursion with value 2] pending
     * -> call[recursion with value 1] pending
     * -> call[recursion with value 0] evaluated
     *
     * @param num
     */
    public void recursion(int num) {
        if (num == 0) {
            return;
        }
        recursion(num - 1);
        System.out.println(num);
    }


    //: f = N! = 1 * 2 * 3 * ... * N;
    // f! = N! = N * (N-1)!
    public long factorialRec(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorialRec(num - 1);
    }

    // fact 5 = 5 * 4 * 3 * 2 * 1
    public long factorialLoop(int num) {
        long fact = num;
        for (int i = num - 1; i > 0; i--) {
            fact *= i;
        }

        return fact;
    }


    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        long result = recursion.factorialLoop(5);

        System.out.println("Factorial: " + result);
    }

}
