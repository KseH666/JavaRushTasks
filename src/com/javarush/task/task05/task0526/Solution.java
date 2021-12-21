package com.javarush.task.task05.task0526;
/* 
Мужчина и женщина
*/
public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Gosha", 25, "SPB");
        Man man2 = new Man("Dima", 30, "Moscow");
        Woman woman1 = new Woman("Masha", 15, "EKB");
        Woman woman2 = new Woman("Nastya", 19, "Klichev");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }
    public static class Man
    {
        String name;
        int age;
        String address;
        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman
    {
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
}
