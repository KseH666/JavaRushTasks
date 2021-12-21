package com.javarush.task.task04.task0415;
import java.io.*;
/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String linea = reader.readLine();
        String lineb = reader.readLine();
        String linec = reader.readLine();
        int a = Integer.parseInt(linea);
        int b = Integer.parseInt(lineb);
        int c = Integer.parseInt(linec);
        int x1 = a+b, x2 = a+c, x3 = b+c;
            if ( x1 > c && x2 > b && x3 > a )
                System.out.println("Треугольник существует.");
            else
                System.out.println("Треугольник не существует.");
        }
}
