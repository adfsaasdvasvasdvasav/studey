package com.example.studey.java.demo1.TeZheng.封装this关键字;

public class StudentTest {
    public static void main(String[] args){

        Student student = new Student();
        student.setAge(20) ;
        student.setName("张名") ;
        student.setMale(true);

        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.isMale());
        System.out.println(student);
    }
}
