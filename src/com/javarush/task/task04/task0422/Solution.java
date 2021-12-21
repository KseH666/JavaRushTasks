package com.javarush.task.task04.task0422;
import java.io.*;
/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        int age = Integer.parseInt(second);
        if (age < 18)
            System.out.println("Подрасти еще");

    }
}
