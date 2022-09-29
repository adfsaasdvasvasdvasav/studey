package com.example.studey.java.demo1.Method;

public class Meyhod03 {

    public static void main(String[] args){
        //单独调用
        sum(12,12);
        System.out.println(sum(12,12));
        //赋值调用
        int c =sum(13,13);
        System.out.println(c );
    }

    public static int sum (int a, int b){
        int result =a+b ;
        return result;


    }

}
