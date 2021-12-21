package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/*
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(0, "a");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(0, "с");
        arrayOfStringList[0] = list1;
        arrayOfStringList[1] = list2;
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}