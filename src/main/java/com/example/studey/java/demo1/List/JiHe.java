package com.example.studey.java.demo1.List;

import java.util.ArrayList;

public class JiHe {

    public static void main(String[] args){
        //ArrayList属于Java Util包下面的类
        ArrayList arrayList = new ArrayList();
        //可以填写任意的数据类型。
        arrayList.add("112");
        arrayList.add(121);
        arrayList.add(true);

        System.out.println(arrayList);

        //使用范型来固定集合的数据类型，并且只能是引用数据类型。
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("jiping");
        arrayList1.add("9");
        //有序，可重复，有索引
        System.out.println(arrayList1);

    }

}
