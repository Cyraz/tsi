package com.tsi.java.pa2;

import java.util.Random;

public class Worker extends Thread {
    boolean killSwitch;


    public Worker(String name, boolean killSwitch) {
        super(name);
        this.killSwitch = killSwitch;
    }

    public void setKillSwitch(boolean killSwitch) {
        this.killSwitch = killSwitch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("This is " + getName() + " " + i);

            try {
                Thread.sleep(new Random().nextInt(50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (killSwitch == true) {
                break;
            }
        }
    }
}
