package com.example.studey.java.demo1.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoop2 {

    public static void main(String[] args){

        Map<String,Integer>  map1 = new HashMap<>();
        map1.put("nihao",12);
        map1.put("nadjka",13);
        map1.put("asjdfai",14);
        map1.put("kkk",15);
        System.out.println(map1.size());
        System.out.println(map1.get("kkk"));

        Set<String> keySet = map1.keySet();

        for (String key:keySet){
            Integer value = map1.get(key) ;
            System.out.println(key+"="+value);
        }

    }
}
