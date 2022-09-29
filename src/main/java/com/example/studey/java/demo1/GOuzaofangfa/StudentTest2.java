package com.example.studey.java.demo1.GOuzaofangfa;

public class StudentTest2 {
    public static void main(String[] args){
        Student2 student2 = new Student2();

        student2.setAge(12);
        student2.setName("ni");
        System.out.println(student2.getAge());
        System.out.println(student2.getName());

        Student2 student21 =new Student2(12,"保罗");
        System.out.println(student21.getName());
        System.out.println(student21.getAge());

    }
}
