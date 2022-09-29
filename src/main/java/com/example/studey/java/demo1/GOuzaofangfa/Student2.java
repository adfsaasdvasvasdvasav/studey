package com.example.studey.java.demo1.GOuzaofangfa;

public class Student2 {
    private int age;
    private String name;

//空参构造
    public Student2(){

    }
    //有参构造
    public Student2(int age,String name){
        this.age=age;
        this.name=name;
    }
   // Getter、Setter
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
