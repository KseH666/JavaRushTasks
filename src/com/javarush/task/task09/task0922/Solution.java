package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String time = reader.readLine();
        SimpleDateFormat Old  = new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH);
        Date date = Old.parse(time);
        SimpleDateFormat New = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(New.format(date).toUpperCase());
    }
}
