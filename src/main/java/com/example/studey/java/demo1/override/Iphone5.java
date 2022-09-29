package com.example.studey.java.demo1.override;

public class Iphone5 extends Iphone4s{

    @Override //注解 标示作用，标示Siri（）为重写方法，并且检测是否重写正确。

    public void siri (){
        System.out.println("hellow siri");
        System.out.println("你好，Siri");
    }
}
