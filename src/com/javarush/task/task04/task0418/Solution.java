package com.javarush.task.task04.task0418;
import java.io.*;
/* 
Минимум двух чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        if (a < b)
            System.out.println(a);
        if (b < a)
            System.out.println(b);
        if (a == b)
            System.out.println(a);
    }
}