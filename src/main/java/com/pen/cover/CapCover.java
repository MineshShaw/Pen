package com.pen.cover;

public class CapCover implements Cover {
    @Override
    public void start() {
        System.out.println("Removing cap.");
    }

    @Override
    public void close() {
        System.out.println("Putting cap back on.");
    }
}