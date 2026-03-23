package com.pen.refill;

public class CartridgeRefill implements Refill {
    @Override
    public void refill(String color) {
        System.out.println("Swapping out old cartridge for a new " + color + " one.");
    }
}

