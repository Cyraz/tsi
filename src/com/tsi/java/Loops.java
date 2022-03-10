package com.tsi.java;

public class Loops {

    public void demoForLoop() {

        for(int i = 0; i <= 100 ; i++) {  // infinite loop
            System.out.println("This is for loop: i = " + i);
        }
    }

    public void demoWhileLoop() {

        int counter = 0;

        while (true) {
            System.out.println("This is while loop: " + counter);

            if(counter++ == 100) {
                break;
            }
        }
    }

    public void demoDoWhileLoop() {
        int flag = 0;

        do {
            System.out.println("This is while loop: " + flag);
            flag++;

        } while (false) ;
    }


    public static void main(String... args) {
        Loops loops = new Loops();
        loops.demoDoWhileLoop();
    }
}
