package com.elixrlabs.Thread;

public class Driver {
    public static void main(String[] args) {
        Tom t = new Tom();
        Jerry j = new Jerry();
        t.start();
        j.start();
    }
}
