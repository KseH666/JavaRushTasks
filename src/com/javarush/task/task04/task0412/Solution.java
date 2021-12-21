package com.javarush.task.task04.task0412;
import java.io.*;
/*
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = Integer.parseInt(a);
if (b > 0) {
   int b1 = b * 2;
    System.out.println(b1);
}
else if (b < 0) {
   int b2 = b + 1;
    System.out.println(b2+1);
}
else
            System.out.println(b);

    }

}