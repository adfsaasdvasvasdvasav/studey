package com.example.studey.java.demo1.GOuzaofangfa;

public class Student3 {
    private String name;
    private Integer age;

    public Student3 (){

    }
    public Student3 (String name, Integer age){
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public Integer getAge(){
        return age;
    }
}
