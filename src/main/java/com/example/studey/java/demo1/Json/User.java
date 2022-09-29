package com.example.studey.java.demo1.Json;

public class User {
    private String name;
    private int age;
    private Integer score;

    public User(){
    }
    public User(String name,int age,Integer score){

    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge() {
        return age;
    }
   public  void setScore(int score){
        this.score=score;
   }
   public Integer getScore(){
        return score;
   }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

