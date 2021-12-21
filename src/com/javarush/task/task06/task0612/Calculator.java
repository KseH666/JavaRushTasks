package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return (a + b);
    }

    public static int minus(int a, int b) {
        return (a - b);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static double division(int a, int b) {
        double d = ((1.0 * a) / (1.0 * b));
        return d;
    }

    public static double percent(int a, int b) {
        double p = (a * (b / 100.0));
        return p;
    }

    public static void main(String[] args) {
        System.out.println(division(53, 21));
    }
}