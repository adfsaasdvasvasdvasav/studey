package com.example.studey.java.demo1.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoop1 {
    public static void main(String[] args){

        Map<String,Integer> hashMap1 = new HashMap<>();

        hashMap1.put("身高",178);
        hashMap1.put("体重",156);
        hashMap1.put("年龄",23);

        System.out.println(hashMap1.size() );
        System.out.println(hashMap1.get("身高"));

        Set<String> key = hashMap1.keySet();
        for (String element:key){
            Integer value=  hashMap1.get(element);
            System.out.println(element+"="+value);
        }

    }
}
