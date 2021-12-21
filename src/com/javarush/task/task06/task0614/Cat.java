package com.javarush.task.task06.task0614;

/* 
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            cats.add(new Cat());
            a++;
        }
        printCats();
    }

    public static void printCats() {
        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}
