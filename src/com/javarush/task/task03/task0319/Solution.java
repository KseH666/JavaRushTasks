package com.javarush.task.task03.task0319;
import java.io.*;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name =  reader.readLine();
        String sAge1 = reader.readLine();
        String sAge2 = reader.readLine();
        int nAge1 = Integer.parseInt(sAge1);
        int nAge2 = Integer.parseInt(sAge2);
        System.out.println(name + " получает " + sAge1 + " через " +sAge2 +" лет.");

    }
}
