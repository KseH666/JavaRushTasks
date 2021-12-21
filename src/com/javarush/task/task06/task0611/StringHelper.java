package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        return s + s + s + s + s;
    }

    public static String multiply(String s, int count) {
        StringBuilder builder = new StringBuilder();
//        String result = "";
        while (count > 0) {
            builder.append(s);
//            result = result + s;
            count--;
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(multiply("amigo"));
        System.out.println(multiply("amigo", 10));

    }
}
