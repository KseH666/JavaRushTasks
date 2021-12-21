package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }catch (Exception e){
//            printStack(e);
            e.printStackTrace();
        }
    }
    public static void divideByZero(){
//        int a = ((int)(100*Math.random()))/0;
        int a = 100/0;
        System.out.println(a);
    }
//    public static void printStack(Throwable throwable) {
//        System.out.println(throwable);
//        for (StackTraceElement element : throwable.getStackTrace()) {
//            System.out.println(element);
//        }
//    }
}
