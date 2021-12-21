package com.javarush.task.task04.task0423;
import java.io.*;
/* 
Фейс-контроль
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        int age = Integer.parseInt(second);
        if (age > 20)
            System.out.println("И 18-ти достаточно");

    }
}
