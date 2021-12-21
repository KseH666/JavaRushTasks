package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
        ArrayList array = new ArrayList();
        LinkedList link = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            array.add(new Object());
        }
        for (int i = 0; i < 10000; i++) {
            link.add(new Object());
        }
        Date ct = new Date();
        for (int i = 0; i < 10000; i++) {
            array.get(i);
        }
        Date nt = new Date();
        long d = nt.getTime() - ct.getTime();
        Date ct1 = new Date();
        for (int i = 0; i < 10000; i++) {
            link.get(i);
        }
        Date nt1 = new Date();
        long d1 = nt1.getTime() - ct1.getTime();
        if (d < d1) {
            return array;
        } else return link;
    }

    public static List getListForSet() {
        ArrayList array = new ArrayList();
        LinkedList link = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            array.add(new Object());
        }
        for (int i = 0; i < 10000; i++) {
            link.add(new Object());
        }
        Date ct = new Date();
        for (int i = 0; i < 10000; i++) {
            array.set(i, new Object());
        }
        Date nt = new Date();
        long d = nt.getTime() - ct.getTime();
        Date ct1 = new Date();
        for (int i = 0; i < 10000; i++) {
            link.set(i, new Object());
        }
        Date nt1 = new Date();
        long d1 = nt1.getTime() - ct1.getTime();
        if (d < d1) {
            return array;
        } else return link;
    }

    public static List getListForAddOrInsert() {
        ArrayList array = new ArrayList();
        LinkedList link = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            array.add(new Object());
        }
        for (int i = 0; i < 10000; i++) {
            link.add(new Object());
        }
        Date ct = new Date();
        for (int i = 0; i < 10000; i++) {
            array.add(i, new Object());
        }
        Date nt = new Date();
        long d = nt.getTime() - ct.getTime();
        Date ct1 = new Date();
        for (int i = 0; i < 10000; i++) {
            link.add(i, new Object());
        }
        Date nt1 = new Date();
        long d1 = nt1.getTime() - ct1.getTime();
        if (d > d1) {
            return array;
        } else return link;
    }

    public static List getListForRemove() {
        ArrayList array = new ArrayList();
        LinkedList link = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            array.add(new Object());
        }
        for (int i = 0; i < 10000; i++) {
            link.add(new Object());
        }
        Date ct = new Date();
        for (int i = 9999; i >= 0; i--) {
            array.remove(i);
        }
        Date nt = new Date();
        long d = nt.getTime() - ct.getTime();
        Date ct1 = new Date();
        for (int i = 9999; i >= 0; i--) {
            link.remove(i);
        }
        Date nt1 = new Date();
        long d1 = nt1.getTime() - ct1.getTime();
        if (d < d1) {
            return array;
        } else return link;
    }

    public static void main(String[] args) {
        getListForGet();
        getListForAddOrInsert();
        getListForRemove();
        getListForSet();
    }
}
