package com.pen.writable;

public class BallWritable implements Writable {
    @Override
    public void write(String color, String input) {
        System.out.println("Writing with ballpoint (" + color + "): " + input);
    }
}
