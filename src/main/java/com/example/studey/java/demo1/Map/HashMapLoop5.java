package com.example.studey.java.demo1.Map;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoop5 {
    public static void main(String[] args){
        Map<String,Integer> map =new HashMap();
        map.put("po",12);
        map.put("do",14);
        map.put("ho",12);

        System.out.println(map.size());
        System.out.println(map.get("do"));
        Set<String> strings = map.keySet();
        for (String key:strings){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        String string = JSONObject.toJSONString(map);
        System.out.println(string);
    }
}
