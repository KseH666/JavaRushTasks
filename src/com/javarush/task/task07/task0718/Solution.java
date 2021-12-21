package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            words.add(reader.readLine());
        }
        for (int i = 0; i < words.size()-1; i++){
            if (words.get(i).length() > words.get(i+1).length()){
                System.out.println(i+1);
                break;
            }
        }
    }
}

