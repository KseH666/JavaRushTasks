package com.javarush.task.task08.task0817;



import java.util.HashMap;
import java.util.Map;


/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("SureName1", "name");
        map.put("SureName2", "name1");
        map.put("SureName3", "name2");
        map.put("SureName4", "name3");
        map.put("SureName5", "name1");
        map.put("SureName6", "name4");
        map.put("SureName7", "name2");
        map.put("SureName8", "name6");
        map.put("SureName9", "name5");
        map.put("SureName10", "name2");
        return map;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<String, String>(map);
        Map<String, String> secondCopy = new HashMap<String, String>(map);
        for(Map.Entry<String, String> pair: copy.entrySet()){
            secondCopy.remove(pair.getKey());
            if (secondCopy.containsValue(pair.getValue())) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {


    }
}
