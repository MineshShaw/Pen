package com.pen.factory;

import com.pen.cover.CapCover;
import com.pen.cover.ClickCover;
import com.pen.cover.Cover;
import com.pen.model.Pen;
import com.pen.refill.CartridgeRefill;
import com.pen.refill.PlasticPipeRefill;
import com.pen.refill.Refill;
import com.pen.writable.BallWritable;
import com.pen.writable.GelWritable;
import com.pen.writable.InkWritable;
import com.pen.writable.Writable;

public class PenFactory {
    public static Pen createPen(String writableType, String coverType, String refillType, String inkColor) {
        
        Writable writer = switch (writableType.toLowerCase()) {
            case "gel" -> new GelWritable();
            case "ink" -> new InkWritable();
            case "ball" -> new BallWritable();
            default -> throw new IllegalArgumentException("Unknown Writable type: " + writableType);
        };

        Cover cover = switch (coverType.toLowerCase()) {
            case "cap" -> new CapCover();
            case "click" -> new ClickCover();
            default -> throw new IllegalArgumentException("Unknown Cover type: " + coverType);
        };

        Refill refill = switch (refillType.toLowerCase()) {
            case "cartridge" -> new CartridgeRefill();
            case "pipe" -> new PlasticPipeRefill();
            default -> throw new IllegalArgumentException("Unknown Refill type: " + refillType);
        };

        return new Pen(inkColor, writer, cover, refill);
    }
}
