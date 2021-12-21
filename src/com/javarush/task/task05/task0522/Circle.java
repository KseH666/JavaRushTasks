package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x)
    {
        this.x = x;
    }
    public Circle()
    {}
    public Circle(Circle z)
    {
        this.x = z.x;
        this.y = z.y;
        this.radius = z.radius;
    }
    public static void main(String[] args) {

    }
}