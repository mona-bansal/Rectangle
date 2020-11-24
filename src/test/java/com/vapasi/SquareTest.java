package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shouldGiveAreaOfASquare() {
        double side = 1.435;
        double expectedArea = side * side;
        Square square = new Square(side);
        assertEquals(expectedArea,square.getArea());
    }

    @Test
    public void shouldGivePerimeterOfASquare() {
        double side = 1.435;
        double expectedPerimeter = 4 * (side);
        Square square = new Square(side);
        assertEquals(expectedPerimeter,square.getPerimeter());
    }
}
