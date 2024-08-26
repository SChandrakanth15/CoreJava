package com.elixrlabs.generics;

public class Box<T> {
    T content;

    public Box(T content) {
        this.content = content;
    }
    public void print()
    {
        System.out.println(content);
    }
}
