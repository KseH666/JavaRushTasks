package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] massive = new String[10];
        for(int i = 0; i < (massive.length-2); i++){
            massive[i] = reader.readLine();
        }
        for(int i = 9; i < massive.length; i--)
            if (i == -1) break;
            else
        System.out.println(massive[i]);
    }
}