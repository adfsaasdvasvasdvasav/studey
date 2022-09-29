package com.example.studey.java.demo1.GOuzaofangfa;

public class StudentTest1 {
    public static void main(String[] args){
        Student1 student1 =new Student1();  //无参构造
        student1.setAge(22);
        student1.setName("乔治");
        System.out.println(student1.getAge());
        System.out.println(student1.getName());

        Student1 student11 =new Student1(23,"curry");
        System.out.println(student11.getName());
        System.out.println(student11.getAge());

    }

}
