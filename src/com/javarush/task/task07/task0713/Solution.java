package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list_main = new ArrayList<>();
        ArrayList<Integer> list_del3 = new ArrayList<>();
        ArrayList<Integer> list_del2 = new ArrayList<>();
        ArrayList<Integer> list0 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list_main.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list_main.size(); i++) {
            int a = list_main.get(i);
            if (a % 3 == 0)
                list_del3.add(a);
            if (a % 2 == 0)
                list_del2.add(a);
            if (a % 2 != 0 && a % 3 != 0)
                list0.add(a);
        }
        printList(list_del3);
        printList(list_del2);
        printList(list0);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
