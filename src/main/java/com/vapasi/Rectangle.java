package com.vapasi;

public class Rectangle {

    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return this.length * this.breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public static Rectangle createSquare(double side) {
        return new Rectangle (side, side);
    }

}
