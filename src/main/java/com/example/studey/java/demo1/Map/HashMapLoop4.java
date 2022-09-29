package com.example.studey.java.demo1.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoop4 {
    public static void main(String [] args){
        Map<String, Integer> map =new HashMap<>();
        map.put("12",12);
        map.put("13",13);
        map.put("15",15);

        System.out.println(map.size());
        System.out.println(map.get("12"));

        Set<String>  keySet = map.keySet();
        for (String key:keySet){

            Integer value = map.get(key) ;
            System.out.println(key+"="+value);
        }


    }
}
