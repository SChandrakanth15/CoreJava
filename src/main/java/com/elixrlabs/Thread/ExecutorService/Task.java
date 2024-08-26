package com.elixrlabs.Thread.ExecutorService;

public class Task extends Thread {
    private int number;

    public Task( int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Task number "+number+ " started!");
        for (int i = 10; i <= 20; i++) {
            System.out.print(+i+" :");
        }
        System.out.println("Task number "+number+ " ended!");
    }
}
