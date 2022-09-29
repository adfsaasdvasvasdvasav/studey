package com.example.studey.java.demo1.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop5 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list.size());
        System.out.println(list.get(0));
        for (int i=0 ;i <list.size();i++){
            System.out .println(list.get(i));
        }
    }
}
