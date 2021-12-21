package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numb = new int[20];
        int maximum;
        int minimum;
        for (int i = 0; i < numb.length; i++) {
            numb[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(numb);
        maximum = numb[19];
        minimum = numb[0];
        System.out.print(maximum + " " + minimum);
    }
}
