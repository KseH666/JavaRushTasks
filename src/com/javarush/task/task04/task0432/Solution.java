package com.javarush.task.task04.task0432;
import java.io.*;
/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        int N = Integer.parseInt(second);
        while (N>0){
            System.out.println(first);
        N--;
    }}
}
