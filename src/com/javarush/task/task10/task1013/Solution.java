package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private String lastName;
        private int sizeFoot;
        private boolean sex;
        private String country;

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age, String name, String lastName){
            this.age = age;
            this.name = name;
            this.lastName = lastName;
        }
        public Human(int age, String name, String lastName, int sizeFoot){
            this.age = age;
            this.name = name;
            this.lastName = lastName;
            this.sizeFoot = sizeFoot;
        }
        public Human(int age, String name, String lastName, int sizeFoot, boolean sex){
            this.age = age;
            this.name = name;
            this.lastName = lastName;
            this.sizeFoot = sizeFoot;
            this.sex = sex;
        }
        public Human(int age, String name, String lastName, int sizeFoot, boolean sex, String country){
            this.age = age;
            this.name = name;
            this.lastName = lastName;
            this.sizeFoot = sizeFoot;
            this.sex = sex;
            this.country = country;
        }
        public Human(int age, String name, String lastName, boolean sex, String country){
            this.age = age;
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.country = country;
        }
        public Human(String name, String lastName, boolean sex, String country){
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.country = country;
        }
        public Human(int age, String name, String lastName, String country){
            this.age = age;
            this.name = name;
            this.lastName = lastName;
            this.country = country;
        }
        public Human(String name, String lastName, String country){
            this.name = name;
            this.lastName = lastName;
            this.country = country;
        }
        public Human(int age, boolean sex, String country){
            this.age = age;
            this.sex = sex;
            this.country = country;
        }

    }
    }
