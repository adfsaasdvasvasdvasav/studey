package com.example.studey.java.demo1.GOuzaofangfa;

public class Student {
    private int age;
    private String name;

    //无参构造
    public Student(){
    }
    //全参构造
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    //Getter、Setter方法

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
