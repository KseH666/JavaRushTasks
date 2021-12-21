package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1, b = 1;
        while (a <11){
            while (b <10) {
                System.out.print(a * b+ " ");
                b++;
            }
                System.out.println(a*b);
            b = 1;
                        a++;

    }
}}
