package com.example.studey.java.demo1.Method;



//今天来学习数组，定义一个数组，数组是什么
public class Day02 {

    public static void main(String[] args){
        int[] age = {12,32,12,32,11};
        int[] age1 = {2,3,13,13};
        int[] a={12,13,11,122};
        int[] number ={12,12,12,12,};
        System.out.println(a[1]);
        System.out.println(number[1]);

        System.out.println(age[1]);  //以索引的方式打印数组

        int[] ages = new int[5];//new 一个数组   动态初始化一个数组
        ages[0]=2;
        System.out.println(ages[0]);
    }
}
