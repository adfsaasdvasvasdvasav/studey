package com.example.studey.java.demo1.List;

import java.util.ArrayList;

public class ArriListAPI {
    public static void main(String[] args){
        //  集合最重要的三个方法：存进去、取出来、长度
        //单列集合
        //1、存进去
        ArrayList<String> arrayList =new  ArrayList();
        arrayList.add("ping");
        arrayList.add("jihe");
        arrayList.add("1212");
        System.out.println(arrayList);
        //2、取出来
        System.out.println(arrayList.get(1));
        //3、长度
        System.out.println(arrayList.size());
        //删除  remove
        //修改  set

    }
}
