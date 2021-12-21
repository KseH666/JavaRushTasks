package com.javarush.task.task04.task0428;
import java.io.*;
/* 
Положительное число
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
        int z=0;
        if (a>0)
            z++;
        if (b>0)
            z++;
        if (c>0)
            z++;
        System.out.println(z);


    }
}
