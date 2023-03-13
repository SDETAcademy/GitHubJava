package day_44;

import static day_44.Paintable.canvasSize;

public class PaintingObject {
    public static void main(String[] args) {
        Painting painting = new Painting();
        painting.paint();
        System.out.println(canvasSize(5));
    }
}
