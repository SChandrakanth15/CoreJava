package com.elixrlabs.generics;

public class MainBox {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(23);
        box.print();
        Box <String > box1 = new Box<>("hi");
        box1.print();
    }
}
