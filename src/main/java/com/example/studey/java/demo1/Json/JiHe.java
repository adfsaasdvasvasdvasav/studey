package com.example.studey.java.demo1.Json;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;

public class JiHe {
    public static void main(String[] args) {

        String json = "[\n" +
                "    {\n" +
                "        \"clientSn\":\"G1RS012109000039\",\n" +
                "        \"partnerSn\":\"G3RB012207000007\",\n" +
                "        \"poiId\":80045539,\n" +
                "        \"merchantNo\":16014217636\n" +
                "    },\n" +
                "    {\n" +
                "        \"clientSn\":\"G1RS012109000039\",\n" +
                "        \"partnerSn\":\"G3RB012207000007\",\n" +
                "        \"poiId\":80045539,\n" +
                "        \"merchantNo\":16014217636\n" +
                "    }\n" +
                "]";

        List<HashMap> list = JSONObject.parseArray(json, HashMap.class);

       System.out.println(list.size());
       System.out.println(list.get(0));

        for (int i=0;i <list.size();i ++) {
            System.out.println(list.get(i));
        }

        List<User> users = JSONObject.parseArray(json, User.class);
        for (int i=0;i <users.size();i ++){
            System.out.println(users.get(i));
        }
    }

}
