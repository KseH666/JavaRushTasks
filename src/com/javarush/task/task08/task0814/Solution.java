package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> si = new HashSet<>();
        si.add(1);
        si.add(5);
        si.add(3);
        si.add(8);
        si.add(10);
        si.add(12);
        si.add(-2);
        si.add(100);
        si.add(140);
        si.add(0);
        si.add(11);
        si.add(51);
        si.add(31);
        si.add(81);
        si.add(101);
        si.add(121);
        si.add(-21);
        si.add(1001);
        si.add(1401);
        si.add(-500);
        return si;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        for (int i = -100000; i < 100000; i++){
            if (i > 10) {

                set.remove(i);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        removeAllNumbersGreaterThan10(createSet());

    }
}
