package com.javarush.task.task04.task0424;
import java.io.*;
/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        String third = reader.readLine();
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        int c = Integer.parseInt(third);
        if (a == b)
            System.out.println(3);
        if (a == c)
            System.out.println(2);
        if (b == c)
            System.out.println(1);

    }
}
