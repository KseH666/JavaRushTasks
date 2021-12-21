package com.javarush.task.task04.task0413;
import java.io.*;
/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Day = reader.readLine();
        int number = Integer.parseInt(Day);
    if (number == 1) {
        System.out.println("понедельник");
    }
    if (number == 2) {
        System.out.println("вторник");
    }
    if (number == 3) {
        System.out.println("среда");
    }
    if (number == 4) {
        System.out.println("четверг");
    }
    if (number == 5) {
        System.out.println("пятница");
    }
    if (number == 6) {
        System.out.println("суббота");
    }
    if (number == 7) {
        System.out.println("воскресенье");
    }
    if (number < 1 || number > 7)
        System.out.println("такого дня недели не существует");

    }
}