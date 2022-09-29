package com.example.studey.java.demo1.GOuzaofangfa;

public class StudentTest {
    public static void main(String [] args){
        Student student1 = new Student();  //无参构造
        student1.setAge(22);
        student1.setName("成龙");
        System.out.println(student1.getName() +student1.getAge() );

        Student  student2 =new Student("李连杰",23);  //   全参构造
        System.out.println(student2.getName()+student2.getAge());
        student2.setName("张杰");
        System.out.println(student2.getName()+student2.getAge());
    }
}
