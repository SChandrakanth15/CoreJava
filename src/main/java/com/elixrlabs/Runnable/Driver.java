package com.elixrlabs.Runnable;

public class Driver {
    public static void main(String[] args) {
        Amazon a = new Amazon();
        Paytm p = new Paytm();
        //to convert the runnable objects to the Thread.
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(p);
        t1.start();
        t2.start();
    }
}
