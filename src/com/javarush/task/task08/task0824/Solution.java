package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Human Child0 = new Human("Чилд0", true, 18);
        Human Child1 = new Human("Чилд1", false, 15);
        Human Child2 = new Human("Чилд2", false, 10);
        List<Human> children = new ArrayList<>();
        children.add(Child0);
        children.add(Child1);
        children.add(Child2);
        System.out.println(Child0);
        System.out.println(Child1);
        System.out.println(Child2);
        Human Papa = new Human("Папа", true, 40, children);
        Human Mama = new Human("Мама", false, 35, children);
        System.out.println(Papa);
        System.out.println(Mama);
        children.clear();
        children.add(Papa);
        Human Ded0 = new Human("Дед0", true, 70, children);
        Human Bab0 = new Human("Баба0", false, 80, children);
        System.out.println(Ded0);
        System.out.println(Bab0);
        children.clear();
        children.add(Mama);
        Human Ded1 = new Human("Дед1", true, 73, children);
        Human Bab1 = new Human("Баба1", false, 65, children);
        System.out.println(Ded1);
        System.out.println(Bab1);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }

    }
}
