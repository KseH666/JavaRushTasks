package com.javarush.task.task04.task0429;
import java.io.*;
/* 
Положительные и отрицательные числа
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
        int z = 0, z1 = 0;
        if(a > 0 )
            z++;
        else if(a !=0) z1++;
        if(b > 0)
            z++;
        else if(b !=0) z1++;
        if(c > 0)
            z++;
        else if(c !=0) z1++;
        System.out.println("количество отрицательных чисел: "+ z1);
        System.out.println("количество положительных чисел: "+ z);

    }
}
