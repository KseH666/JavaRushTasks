package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int p0 = 0, p1 = 0;
        if (this.age > anotherCat.age) {p0++;}
        else if (this.age == anotherCat.age) {p0++; p1++;}
        else {p1++;}
        if (this.weight > anotherCat.weight) {p0++;}
        else if (this.weight == anotherCat.weight) {p0++; p1++;}
        else {p1++;}
        if (this.strength > anotherCat.strength) {p0++;}
        else if (this.strength == anotherCat.strength) {p0++; p1++;}
        else {p1++;}
        if (p0 > p1) {return true;}
        else return false;



    }

    public static void main(String[] args) {

    }
}
