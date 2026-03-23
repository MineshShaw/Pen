package com.pen.refill;

public class PlasticPipeRefill implements Refill {
    @Override
    public void refill(String color) {
        System.out.println("Injecting " + color + " ink into the plastic pipe refill.");
    }
}