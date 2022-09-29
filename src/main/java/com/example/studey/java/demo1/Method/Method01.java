package com.example.studey.java.demo1.Method;

public class Method01 {
    public static void main(String[] args){

        sum(10,20);//方法的单独调用
        System.out.println(sum(10,20));

        System.out.println("========");
        int s  =sum(13,14);  //方法的赋值调用
        System.out.println("变量的值为："+s);

    }

    public static int sum (int a,int b){
        int result =a +b ;
        return  result;
    }
}
