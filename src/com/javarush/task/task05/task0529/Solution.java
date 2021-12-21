package com.javarush.task.task05.task0529;

import java.io.*;
/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        while (true) {
            String a = reader.readLine();
            if (a.equals("сумма")) {
                System.out.println(b);
                break;
            } else {
                int c = Integer.parseInt(a);
                b = c + b;
            }
        }
    }
}
