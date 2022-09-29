package com.example.studey.java.demo1.override;

public class Cat extends Animal{

    public static void main(String[] args){

        Animal animal = new Animal();
        animal.sleep();
        System.out.println(animal);
    }

    public void zhua(){
        System.out.println("====抓老鼠====");
    }
@Override
    public void eat(){
        System.out.println("=====去吃饭====");
    }

}
