package com.example.studey.java.demo1.Map;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoop6 {
    public static void main(String [] args){

        Map<String,Integer> map1 = new HashMap<>();

        map1.put("你好",123);
        map1.put("好的",456);

        System.out.println(map1.get("你好"));
        System.out.println(map1.size());

        Set<String> set = map1.keySet();
        for (String key :set){
            Integer value= map1.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println(JSONObject.toJSONString(map1));
        System.out.println(map1.toString());


    }

}
