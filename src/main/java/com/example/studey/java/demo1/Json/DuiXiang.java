package com.example.studey.java.demo1.Json;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Set;

public class DuiXiang {
    public static void main(String [] args){
        String json = "{\n" +
                "    \"clientSn\":\"G1RS012109000039\",\n" +
                "    \"partnerSn\":\"G3RB012207000007\",\n" +
                "    \"poiId\":80045539,\n" +
                "    \"merchantNo\":16014217636\n" +
                "}";
        HashMap hashMap = JSONObject.parseObject(json, HashMap.class);

        System.out.println(hashMap.size());
        System.out.println(hashMap);
        
        Set<String> set = hashMap.keySet();
        for (String key:set){
            Object value = hashMap.get(key);
                System.out.println(key+"="+value);


        }
    }

}
