package com.pen.cover;

public class ClickCover implements Cover {
    @Override
    public void start() {
        System.out.println("Clicking to extend nib.");
    }

    @Override
    public void close() {
        System.out.println("Clicking to retract nib.");
    }
}
