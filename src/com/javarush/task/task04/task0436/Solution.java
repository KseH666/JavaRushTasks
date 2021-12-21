package com.javarush.task.task04.task0436;
import java.io.*;
/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        for (int c = 1; c <= a; c++) {
            for (int d = 1; d < b; d++)
                System.out.print("8");
                System.out.println("8");
        }

    }
}
