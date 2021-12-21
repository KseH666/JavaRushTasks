package com.javarush.task.task08.task0815;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Фамилия1", "ваыф");
        map.put("Фамилия2", "мс");
        map.put("Фамилия3", "ап");
        map.put("Фамилия4", "лго");
        map.put("Фамилия5", "ыф");
        map.put("Фамилия6", "Имя1");
        map.put("Фамилия7", "И");
        map.put("Фамилия8", "лор");
        map.put("Фамилия9", "обр");
        map.put("Фамилия10", "исм");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int n = 0;
        List<String> names = new ArrayList<>(map.values());
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)) {
                n++;
            }
        }
        return n;
    }


    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {

    int f = 0;
    List<String> family = new ArrayList<>(map.keySet());
        for (int i = 0; i < family.size(); i++) {
        if (family.get(i).equals(lastName)) {
            f++;
        }
    }
        return f;
}



    public static void main(String[] args) {
        getCountTheSameFirstName(createMap(), "Фамилия1");
        getCountTheSameLastName(createMap(), "312");

    }
}
