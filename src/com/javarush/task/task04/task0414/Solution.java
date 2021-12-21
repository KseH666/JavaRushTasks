package com.javarush.task.task04.task0414;
import java.io.*;
/* 
Количество дней в году
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String year = reader.readLine();
        int q = Integer.parseInt(year);
        if (( q = q % 400 ) == 0) {
            int x = 366;
            System.out.println("количество дней в году: " + x);
        }
        else if ((q = q % 100) == 0) {
            int x = 365;
            System.out.println("количество дней в году: " + x);
        }
            else if((q = q % 4) == 0) {
            int x = 366;
            System.out.println("количество дней в году: " + x);
        }
                else{
                    int x = 365;
            System.out.println("количество дней в году: " + x);
            }
        }
    }
