package com.javarush.task.task03.task0322;
import java.io.*;
/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name =  reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

    }
}