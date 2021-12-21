package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for (int a0 = 10; a0 >= 1; a0--) {
            for (int a1 = a0; a1<=9; a1++)
                System.out.print("8");
            System.out.println("8");
        }
    }
}