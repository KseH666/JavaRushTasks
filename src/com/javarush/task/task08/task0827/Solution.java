package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JAN 1 2000"));
        System.out.println(isDateOdd("JAN 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        if (Integer.parseInt(dateFormat.format(date1)) % 2 != 0) {
            return true;
        } else return false;
    }
}
