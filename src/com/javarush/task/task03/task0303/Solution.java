package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5, 0.25));
        System.out.println(convertEurToUsd(10,0.100));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {

        exchangeRate = eur * exchangeRate;

        return exchangeRate;

    }
}
