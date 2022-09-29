package com.example.studey.java.demo1.override;

public class Dog extends Animal{


    public void kanjia(){

        System.out.println("====可以看家====");
    }
    @Override
    public void sleep(){

        System.out.println("====去睡觉====");
    }
}
