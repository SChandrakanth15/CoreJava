package com.elixrlabs.Thread.ExecutorService;

public class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("task2 started");
        for(int i=0;i<=10;i++)
        {
            System.out.print(" "+i+" :");
        }
        System.out.println("\ntask 2 completed");
    }
}
