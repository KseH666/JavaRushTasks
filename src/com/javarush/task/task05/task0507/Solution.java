package com.javarush.task.task05.task0507;
import java.io.*;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        float a = 0; float r = 0;
        for (int z = 1;;z++)
        {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float b = Float.parseFloat(reader.readLine());

            if (b == -1)
                break;
            a = a +b;
            r = (a/z);


        }
        System.out.println(r);
    }
}

