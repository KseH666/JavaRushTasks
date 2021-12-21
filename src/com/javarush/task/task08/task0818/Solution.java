package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> fullNames = new HashMap<>();
        fullNames.put("Путцевик1", 100);
        fullNames.put("Путцевик2", 200);
        fullNames.put("Путцевик3", 300);
        fullNames.put("Путцевик4", 400);
        fullNames.put("Путцевик5", 500);
        fullNames.put("Путцевик6", 600);
        fullNames.put("Путцевик7", 700);
        fullNames.put("Путцевик8", 800);
        fullNames.put("Путцевик9", 900);
        fullNames.put("Путцевик10", 1000);
        return fullNames;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() < 500) {
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}