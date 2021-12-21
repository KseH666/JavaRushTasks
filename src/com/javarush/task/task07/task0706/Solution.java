package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] mass = new int[15];
        int sum1 = 0, sum2 = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0)
                sum1 = sum1 + mass[i];
            if (i % 2 != 0)
                sum2 = sum2 + mass[i];
        }
        if (sum2 > sum1)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        if (sum2 < sum1)
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
