package com.javarush.task.task03.task0318;
import  java.io.*;
/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        String name =  reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!" );
    }
}
