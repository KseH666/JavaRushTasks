package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String month = buffer.readLine();
        Map<String, Integer> listMonth = new HashMap<>();
        listMonth.put("January", 1);
        listMonth.put("February", 2);
        listMonth.put("March", 3);
        listMonth.put("April", 4);
        listMonth.put("May", 5);
        listMonth.put("June",6);
        listMonth.put("July",7);
        listMonth.put("August",8);
        listMonth.put("September",9);
        listMonth.put("October",10);
        listMonth.put("November",11);
        listMonth.put("December",12);
        System.out.println(month + " is the " + listMonth.get(month) + " month");
    }
}
