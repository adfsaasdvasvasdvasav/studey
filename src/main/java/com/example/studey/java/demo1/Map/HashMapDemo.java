package com.example.studey.java.demo1.Map;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args){
        //hashmap是一个双列集合，无序，无索引，不可重复
        HashMap <String,Integer> hashMap = new HashMap<>();
        hashMap.put("年龄",24);
        hashMap.put("身高",179);
        hashMap.put("体重",60);

        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("身高"));

    }
}
