package com.example.studey.java.demo1.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoop3 {
    public static void main(String [] args){

        Map<String,Integer > map1 = new HashMap<>();
        map1.put("1212",11);
        map1.put("12",22);
        map1.put("134",33);

        System.out.println(map1.size());
        System.out.println(map1.get("12") );

        Set<String> keySet = map1.keySet();
        for (String key:keySet){
            Integer value = map1.get(key) ;
            System.out.println(key+"="+value);
        }
    }
}
