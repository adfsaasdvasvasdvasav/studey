package com.example.studey.java.demo1.Method;

public class Day0601Method {
    public static void main(String [] args){
        int i=20;
        int j=30;
        method(i,j);
    }
    public static void method(int a,int b){
        System.out.println(a+b);
    }
}

//注意事项
//1、方法的定义：访问修饰符（public）  返回值  方法名  （参数列表）；
//2、static 不加也可以，但是必须得在main方法中直接调用，所以必须得加static；void是没有返回值；
//3、以上的i、j为实参；a、b为形参；
//4、方法的特点：方法直接可以调用；是平级的，也就是说，不能在同一个作用域；
//5、用debug调试的时候，必须用向下箭头，才可以进入方法里面，否则不能跳转到方法里。


