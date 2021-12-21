package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
//        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
//        strings.add("вода");
//        strings.add("упор");
        strings = fix(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (!strings.get(i).contains("р") && strings.get(i).contains("л")) {
                strings.add(i, strings.get(i));
                i = i + 1;
            }
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")) {
                strings.remove(i);
                i--;
            }
        }
        return strings;
    }
}
