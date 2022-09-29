package com.example.studey.java.demo1.jicheng;


//1、通过extends来描写父子关系，子类可以拥有父类的非私有成员变量。
//2、如果一个类不继承任何类，则默认继承object类，object是Java中的祖宗类。
//3、一个父类可以有多个子类。

public class Pratice {
    public static void main(String [] args){

        Teacher teacher = new Teacher();
        teacher.age=22;
        teacher.name ="lol";
        System.out.println(teacher.age);
        System.out.println(teacher.name);
        teacher.eat() ;

    }

}
