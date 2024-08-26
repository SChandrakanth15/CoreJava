package com.elixrlabs.Thread.ExecutorService;

public class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("task1 started");
        for (int i = 11; i <= 20; i++) {
            System.out.print(" "+ i+ " :");
        }
        System.out.println("\ntask 1 completed");
    }
}
