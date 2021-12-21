package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];
        int[] n = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < s.length; a++) {
            s[a] = reader.readLine();
        }
        for (int b = 0; b < n.length; b++) {
            n[b] = s[b].length();
            System.out.println(n[b]);
        }
    }
}

