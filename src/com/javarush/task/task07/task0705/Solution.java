package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[20];
        int[] n10 = new int[10];
        int[] n20 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <= numbers.length-1; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        n10 = Arrays.copyOfRange(numbers, 0, 10);
        n20 = Arrays.copyOfRange(numbers, 10, 21);
        for (int i = 0; i < n20.length-1; i++){
            System.out.println(n20[i]);
        }

    }
}
