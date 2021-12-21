package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Cat a1 = new Cat("Gosha1");
        Cat a2 = new Cat("Gosha2");
        Cat a3 = new Cat("Gosha3");
        Cat a4 = new Cat("Gosha4");
        Cat a5 = new Cat("Gosha5");
        Cat a6 = new Cat("Gosha6");
        Cat a7 = new Cat("Gosha7");
        Cat a8 = new Cat("Gosha8");
        Cat a9 = new Cat("Gosha9");
        Cat a10 = new Cat("Gosha10");

        Map<String, Cat> cats = new HashMap<>();
        cats.put("A1", a1);
        cats.put("A2", a2);
        cats.put("A3", a3);
        cats.put("A4", a4);
        cats.put("A5", a5);
        cats.put("A6", a6);
        cats.put("A7", a7);
        cats.put("A8", a8);
        cats.put("A9", a9);
        cats.put("A10", a10);

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> setCats = new HashSet<>();
        setCats.addAll(map.values());

        return setCats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
