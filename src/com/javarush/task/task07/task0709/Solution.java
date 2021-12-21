package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        for (int i = 0; i < list.size(); i++){
            if (min>list.get(i).length()){
            min = list.get(i).length();}
        }
        for (int i = 0; i< list.size(); i++){
            if (min == list.get(i).length()){
                System.out.println(list.get(i));
            }
        }
    }
}
