package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {

    @Test
    public void shouldGiveAreaForARectangle() {
        double len = 12.3;
        double br = 14.6;
        Rectangle rectangle = new Rectangle(len, br);
        double area = rectangle.getArea();
        double expected = len * br;
        assertEquals (expected, area);
    }


    @Test
    public void shouldGivePerimeterForARectangle() {
        double len = 12.3;
        double br = 14.6;

        Rectangle rectangle = new Rectangle(len , br);
        double expectedPerimeter = 2 * (len + br);
        assertEquals(expectedPerimeter, rectangle.getPerimeter());
    }

    @Test
    public void shouldGiveAreaOfASquare() {
        double side = 1.435;
        double expectedArea = side * side;
        Rectangle square = Rectangle.createSquare(side);
        assertEquals(expectedArea,square.getArea());
    }

    @Test
    public void shouldGivePerimeterOfASquare() {
        double side = 1.435;
        double expectedPerimeter = 4 * (side);
        Rectangle square = Rectangle.createSquare(side);
        assertEquals(expectedPerimeter,square.getPerimeter());
    }
}
