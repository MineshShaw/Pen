package com.pen.model;

import com.pen.cover.Cover;
import com.pen.refill.Refill;
import com.pen.writable.Writable;

public class Pen {
    private String ink_color;
    private boolean isOpen;
    private Writable writer;
    private Cover cover;
    private Refill refill;

    public Pen(String ink_color, Writable writer, Cover cover, Refill refill) {
        this.ink_color = ink_color;
        this.writer = writer;
        this.cover = cover;
        this.refill = refill;
        this.isOpen = false;
    }

    public void write(String input) {
        if (isOpen) {
            writer.write(ink_color, input);
        } else {
            System.out.println("Cannot write. Pen is closed.");
        }
    }

    public void start() {
        cover.start();
        this.isOpen = true;
    }

    public void refill(String color) {
        refill.refill(color);
        this.ink_color = color;
    }

    public void close() {
        cover.close();
        this.isOpen = false;
    }
}