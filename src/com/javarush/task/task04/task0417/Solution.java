package com.javarush.task.task04.task0417;
import java.io.*;
/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String linea = reader.readLine();
        String lineb = reader.readLine();
        String linec = reader.readLine();
        int a = Integer.parseInt(linea);
        int b = Integer.parseInt(lineb);
        int c = Integer.parseInt(linec);
        if (a == b && a == c && b == c) {
            System.out.println(a + " " + b + " " + c);
        }
        else if (a == b) {
            System.out.println(a + " " + b);
        }
        else if (a == c) {
            System.out.println(a + " " + c);
        }
        else if(b == c) {
            System.out.println(b + " " + c);
        }
    }
}