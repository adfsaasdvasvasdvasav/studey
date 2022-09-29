package com.example.studey.java.demo1.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop2 {
    public static void main(String[] args){

        List<Integer> list1 =new ArrayList<>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        System.out.println(list1.size());
        System.out.println(list1.get(0));

        for (int i=0;i<list1.size(); i++){

            System.out.println(list1.get(i));
        }
    }
}
