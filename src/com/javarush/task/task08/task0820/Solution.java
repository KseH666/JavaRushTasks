package com.javarush.task.task08.task0820;

import java.util.*;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultCats = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            resultCats.add(new Cat());
        }
        return resultCats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> resultDogs = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            resultDogs.add(new Dog());
        }
        return resultDogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        List<Object> petsList = new ArrayList<>(pets);
        for (int i = 0; i < petsList.size(); i++) {
            System.out.println(petsList.get(i));
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }
}
