package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// объявляем массив длиной в 5 элементов
        int[] arr = new int[5];
// через цикл заполняем массив введенными с клавиатуры числами
        for (int i = 0; i < 5; i++) { arr[i] = Integer.parseInt(reader.readLine()); }
// сортируем массив по возрастанию
        Arrays.sort(arr);
// через перебор массива поэлементно выводим данные на экран
        for (int x : arr) { System.out.println(x); }
    }
}
