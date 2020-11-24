package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {

    @Test
    public void shouldGiveAreaForAnyCoOrdinates() {
        double len = 12.3;
        double br = 14.6;
        Rectangle rectangle = new Rectangle(len, br);
        double area = rectangle.getArea();
        double expected = len * br;
        assertEquals (expected, area);
    }


    @Test
    public void shouldGivePerimeterForAnyCoOrdinates() {
        double len = 12.3;
        double br = 14.6;

        Rectangle rectangle = new Rectangle(len , br);
        double expectedPerimeter = 2 * (len + br);
        assertEquals(expectedPerimeter, rectangle.getPerimeter());
    }
}
