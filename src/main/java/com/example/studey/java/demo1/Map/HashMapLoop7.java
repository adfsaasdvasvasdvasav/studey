package com.example.studey.java.demo1.Map;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoop7 {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap();

        map.put("张赫",22);
        map.put("章程",12);
        map.put("黎明",24);

        System.out.println(map.get("黎明"));
        System.out.println(map.size());

        Set<String> str = map.keySet();
        for (String key:str){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
            System.out.println(JSONObject.toJSONString(map));

        }
    }
}
