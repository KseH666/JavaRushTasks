package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human a = new Human("Андрей", true, 45);
        Human b = new Human("Галина", false, 39);
        Human c = new Human("Дмитрий", true, 55);
        Human d = new Human("Александра", false, 34);
        Human a1 = new Human("Анастасия", false, 15, a, b);
        Human b1 = new Human("Александр", true, 16, c, d);
        Human c1 = new Human("Виктория", false, 17, a, b);
        Human d1 = new Human("Генадий", true, 18, c, b);
        Human e1 = new Human("Ирина", false, 19, a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
    }


    public static class Human {
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}