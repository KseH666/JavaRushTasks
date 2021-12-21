package com.javarush.task.task04.task0425;
import java.io.*;
/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        if (a > 0 && b > 0)
            System.out.println("1");
        if (a < 0 && b > 0)
            System.out.println("2");
        if (a < 0 && b <0)
            System.out.println("3");
        if ( a> 0 && b < 0)
            System.out.println("4");

    }
}
