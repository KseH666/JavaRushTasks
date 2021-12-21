package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int max = list.get(0).length();
        int min = list.get(0).length();
        int a1 = 0, i1 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).length()) {
                max = list.get(i).length();
                i1 = i;
            }
        }
        for (int a = 0; a < list.size(); a++) {
            if (min > list.get(a).length()) {
                min = list.get(a).length();
                a1 = a;
            }
        }
        if (a1 > i1) {
            System.out.println(list.get(i1));
        } else System.out.println(list.get(a1));

    }

}



