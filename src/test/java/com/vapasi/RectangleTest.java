package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


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

}
