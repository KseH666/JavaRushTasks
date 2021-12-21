package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.time.Month.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Васильев", dateFormat.parse("JANUARY 21 2007"));
        map.put("Петров", dateFormat.parse("FEBRUARY 21 2007"));
        map.put("Сидорова", dateFormat.parse("MARCH 1 2007"));
        map.put("Иванов", dateFormat.parse("APRIL 21 2007"));
        map.put("Максимов", dateFormat.parse("MAY 21 2007"));
        map.put("Романов", dateFormat.parse("JUNE 21 2007"));
        map.put("Тимофеев", dateFormat.parse("JULY 21 2007"));
        map.put("Харламов", dateFormat.parse("AUGUST 21 2007"));
        map.put("Анисимов", dateFormat.parse("SEPTEMBER 21 2007"));
        map.put("Левашов", dateFormat.parse("OCTOBER 21 2007"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Date> entry = itr.next();
            if (entry.getValue().getMonth() > 4 & entry.getValue().getMonth() < 8) {
                itr.remove();
            }

        }
    }


    public static void main(String[] args) throws ParseException {
        createMap();
        removeAllSummerPeople(createMap());


    }
}
