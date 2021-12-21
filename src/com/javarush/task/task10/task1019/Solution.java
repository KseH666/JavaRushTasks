package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String id = reader.readLine();
            if (id.equals("")){
                break;
            }
            String name = reader.readLine();
            map.put(name, Integer.parseInt(id));

        }
        List<String> count = new ArrayList<>(map.keySet());
        for (String s : count) {
            System.out.println(map.get(s) + " " + s);
        }
    }
}
