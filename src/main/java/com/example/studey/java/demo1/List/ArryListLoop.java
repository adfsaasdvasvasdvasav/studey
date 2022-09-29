package com.example.studey.java.demo1.List;

import java.util.ArrayList;
import java.util.List;

public class ArryListLoop {
    public static void main(String[] args){
        //集合的遍历
        //1、get+size方法，按照数组的方法去
        List<Integer> list = new ArrayList<>() ;

        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println(list.get(0));
        System.out.println(list.size());

        System.out.println("==========");

        for (int i =0;i<list.size();i ++){

            System.out.println(list.get(i));
        }
    }
}
