package com.example.studey.java.demo1.Method;

public class Method02 {
    public static void main(String [] args){
            //方法的调用

        sum1(109,12);  //单独调用；
        System.out.println(sum1(109,12));
        int r =sum1(12,13);  //赋值调用；
        System.out.println(r);

    }
    public static int sum1(int a,int b){
        int result =a +b ;
        return result;

    }
}
