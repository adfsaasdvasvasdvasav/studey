package com.example.studey.java.demo1.List;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){

        Teacher t1 = new Teacher();
        t1.setAge(25) ;
        t1.setName("张三") ;
        Teacher t2 = new Teacher();
        t2.setAge(35);
        t2.setName("李四");
        Teacher t3 = new Teacher();
        t3.setName("老王");
        t3.setAge(19);
        Teacher t4 =new Teacher();
        t4.setAge(29);
        t4.setName("赵六");

        ArrayList <Teacher> arrayList = new ArrayList<>();
         arrayList.add(t1);
         arrayList.add(t2);
         arrayList.add(t3);
         arrayList.add(t4);
         for (int i=0;i< arrayList.size();i++){
             System.out.println(arrayList.get(i));

         }




    }
}
