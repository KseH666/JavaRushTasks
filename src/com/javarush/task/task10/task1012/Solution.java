package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        Map<Character, Integer> mapOfLetters = new HashMap<>();
        String listToString = "";
        char[] stringToChar;
        for (Character character : alphabet) {
            mapOfLetters.put(character, 0);
        }
        for (int i = 0; i < 10; i++) {
            listToString += (reader.readLine().toLowerCase());
        }
        stringToChar = listToString.toCharArray();
//        for (char c : stringToChar) {
//            for (Character character : alphabet) {
//                if (character.equals(c)) {
//                    int a = mapOfLetters.get(character);
//                    a++;
//                    mapOfLetters.put(character, a);
//                }
//            }
//        }
        for (char c : stringToChar) {
            if (mapOfLetters.containsKey(c)) {
                int a = mapOfLetters.get(c);
                a++;
                mapOfLetters.put(c, a);
            }
        }

        for (Character character : alphabet) {
            System.out.println(character + " " + mapOfLetters.get(character));
        }
    }
}







