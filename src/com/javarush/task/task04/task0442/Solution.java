package com.javarush.task.task04.task0442;
import java.io.*;
/* 
Суммирование
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
int a = 0;
        for (int z=1;;)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int b = Integer.parseInt(reader.readLine());
            a = a + b;
            if (b == -1)
                break;
        }
            System.out.println(a);
    }
}
