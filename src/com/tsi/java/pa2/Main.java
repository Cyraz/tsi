package com.tsi.java.pa2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Worker thread1 = new Worker("Worker_Alpha", false);
        Worker thread2 = new Worker("Worker_Beta", false);
        Worker thread3 = new Worker("Worker_Gamma", false);

        Thread taskM = new TaskManager(List.of(thread1, thread2, thread3));

        thread1.start();
        thread2.start();
        thread3.start();

        taskM.start();

    }
}
