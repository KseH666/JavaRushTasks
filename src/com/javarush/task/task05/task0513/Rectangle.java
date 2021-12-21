package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top = 0;
    private int left = 0;
    private int width = 0;
    private int height = 0;

    public void initialize(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int top, int left)
    {
        this.top = top;
        this.left = left;
    }
    public void initialize(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public void initialize(Rectangle a)
    {
        this.top = a.top;
        this.left = a.left;
        this.width = a.width;
        this.height = a.height;
    }

    public static void main(String[] args) {

    }
}
