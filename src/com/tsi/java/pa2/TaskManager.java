package com.tsi.java.pa2;

import java.util.List;
import java.util.Random;

public class TaskManager extends Thread{

    final List<Worker> workers;

    Random random = new Random();


    public TaskManager(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(random.nextInt(100));
            var worker = workers.get(random.nextInt(workers.size()));
            worker.setKillSwitch(true);
            System.out.println("Killing worker : "+ worker.getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
