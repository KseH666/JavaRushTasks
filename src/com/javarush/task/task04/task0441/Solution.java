package com.javarush.task.task04.task0441;
import java.io.*;
/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        String third = reader.readLine();
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        int c = Integer.parseInt(third);
        int z = a - b, z1 = a - c, z2 = b - c;
        if ( z > 0 && z1 > 0 && z2 < 0 )
            System.out.println(c);
        else if( z < 0 && z1 < 0 && z2 > 0 )
            System.out.println(c);
        else if( z > 0 && z1 > 0 && z2 > 0 )
            System.out.println(b);
        else if( z < 0 && z1 < 0 && z2 < 0 )
            System.out.println(b);
        else if( z > 0 && z1 < 0 && z2 < 0 )
            System.out.println(a);
        else if( z < 0 && z1 > 0 && z2 > 0 )
            System.out.println(a);
        else if ( a == b && a == c )
            System.out.println(a);
        else if ( z1 == 0 )
            System.out.println(a);
        else if ( z2 == 0)
            System.out.println(b);
        else if ( z == 0)
            System.out.println(a);
    }
}
