package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {


    @Test
   public void shouldGiveAreaOneForLengthOneBreadthOne() {
        Rectangle rectangle = new Rectangle(1, 1);
        double area = rectangle.getArea();
        assertEquals (1, area);
    }

    @Test
    public void shouldGiveAreaOneForLengthTwoBreadthThree() {
        Rectangle rectangle = new Rectangle(2, 3);
        double area = rectangle.getArea();
        assertEquals (6, area);
    }

    @Test
    public void shouldGiveAreaLMultipledByBForAnyRectange() {
        double len = 12.3;
        double br = 14.6;
        Rectangle rectangle = new Rectangle(len, br);
        double area = rectangle.getArea();
        double expected = len * br;
        assertEquals (expected, area);
    }
}
