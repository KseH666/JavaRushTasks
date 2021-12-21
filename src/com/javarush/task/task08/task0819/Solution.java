package com.javarush.task.task08.task0819;

import java.util.*;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(Cat.cat0);
        cats.add(Cat.cat1);
        cats.add(Cat.cat2);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        List<Cat> catsList = new ArrayList<>(cats);
        for (int i = 0; i<catsList.size(); i++){
        System.out.println(catsList.get(i));
        }
    }

    public static class Cat{
        static Cat cat0 = new Cat();
        static Cat cat1 = new Cat();
        static Cat cat2 = new Cat();
    }
}
