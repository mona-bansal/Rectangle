package com.vapasi;

import org.junit.jupiter.api.Test;

public class RectangleTest {


    @Test
   public void shouldGiveAreaOneForLengthOneBreadthOne() {
        Rectangle rectangle = new Rectangle(1, 1);
        double area = rectangle.getArea();
    }
}
