package com.javarush.task.task04.task0416;
import java.io.*;
/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String linea = reader.readLine();
        double t = Double.parseDouble(linea);
        if (t%5 >= 4 && t%5 < 5)
            System.out.println("красный");
        else if (t%5 >= 3 && t%5 < 4)
            System.out.println("жёлтый");
        else
            System.out.println("зелёный");

    }
}