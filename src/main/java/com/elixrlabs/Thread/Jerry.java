package com.elixrlabs.Thread;

public class Jerry extends Thread {
    @Override
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
