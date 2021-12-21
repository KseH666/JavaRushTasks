package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        String third = reader.readLine();
        String fourth = reader.readLine();
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        int c = Integer.parseInt(third);
        int d = Integer.parseInt(fourth);
        int comp1, comp2;
        if (a > b)
             comp1 = a;
        else comp1 = b;
        if (c > d)
             comp2 = c;
        else comp2 = d;
        if (comp1 > comp2)
            System.out.println(comp1);
        else System.out.println(comp2);


        }

    }

