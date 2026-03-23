package com.pen;

import com.pen.model.Pen;
import com.pen.factory.PenFactory;

public class Main {
    public static void main(String[] args) {
        Pen fountainPen = PenFactory.createPen("gel", "cap", "cartridge", "Royal Blue");
        
        Pen officePen = PenFactory.createPen("ball", "click", "pipe", "Black");

        System.out.println("--- Testing Fountain Pen ---");
        fountainPen.start();
        fountainPen.write("Hello from the luxury pen!");
        fountainPen.refill("Midnight Black");
        fountainPen.write("Now writing in a new color.");
        fountainPen.close();

        System.out.println("\n--- Testing Office Pen ---");
        officePen.write("Trying to write while closed...");
        officePen.start();
        officePen.write("Meeting notes: fix the printer.");
        officePen.close();
    }
}