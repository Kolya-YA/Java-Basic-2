package com.telran.berlin.homeworks.tasks;

public class Rectangle {
    private int width , height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int perimeter() {
        return 2 * height + 2 * width;
    }

    public int square() {
        return height * width;
    }
}
