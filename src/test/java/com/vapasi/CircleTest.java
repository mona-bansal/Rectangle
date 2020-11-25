package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    double PI = 3.14;

    @Test
    public void shouldCalculateAreaForGivenRadius() {
        double radius = 0;
        Shape circle = new Circle(radius);
        double expectedArea = PI * radius * radius;
        double actualArea = circle.getArea();
        assertEquals(expectedArea, actualArea);
    }


    @Test
    public void shouldCalculatePerimeterForGivenRadius() {
        double radius = 5.0;
        Shape circle = new Circle(radius);
        double expectedPerimeter = 2 * PI * radius;
        double actualPerimeter = circle.getPerimeter();
        assertEquals(expectedPerimeter, actualPerimeter);
    }

}
