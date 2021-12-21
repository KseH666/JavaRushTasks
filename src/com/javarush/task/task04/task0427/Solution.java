package com.javarush.task.task04.task0427;
import java.io.*;
/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        int a = Integer.parseInt(first);
        if (a>0 && a<1000 && a%2 ==0 && (a/100)>=1)
            System.out.println("четное трехзначное число");
        else if (a>0 && a<1000 && a%2 ==0 && (a/10)>=1)
            System.out.println("четное двузначное число");
        else if (a>0 && a<1000 && a%2 ==0 && (a/10)<1)
            System.out.println("четное однозначное число");
        else if (a>0 && a<1000 && a%2 !=0 && (a/100)>=1)
            System.out.println("нечетное трехзначное число");
        else if (a>0 && a<1000 && a%2 !=0 && (a/10)>=1)
            System.out.println("нечетное двузначное число");
        else if (a>0 && a<1000 && a%2 !=0 && (a/10)<1)
            System.out.println("нечетное однозначное число");
    }
}
