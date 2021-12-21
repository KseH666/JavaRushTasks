package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        char[] chars = a.toCharArray();
        Object[] charsG = new Object[(chars.length) + 1];
        Object[] charsS = new Object[(chars.length) + 1];
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                charsG[i] = chars[i];
            }
            if (!(isVowel(chars[i])) && chars[i] != ' ') {
                charsS[i] = chars[i];
            }
        }
        for (int i = 0; i < charsG.length - 1; i++) {
            if (charsG[i] != null) {
                System.out.print(charsG[i]+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < charsS.length - 1; i++) {
            if (charsS[i] != null) {
                System.out.print(charsS[i]+" ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}