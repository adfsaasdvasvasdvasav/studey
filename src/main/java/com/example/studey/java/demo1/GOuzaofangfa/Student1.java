package com.example.studey.java.demo1.GOuzaofangfa;

public class Student1 {
    private Integer age;
    private String name;

    //无参构造
    public Student1(){
    }
    //全参构造
    public Student1 (Integer age,String name){
        this.age=age;
        this.name=name;
    }
    //Gettre\Setter方法
    public void setAge(Integer age){
        this.age=age;
    }
    public Integer getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
