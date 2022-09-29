package com.example.studey.java.demo1.Json;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;

public class JsonDemoJiHe {
    public static void main(String[] args) {
        //json字符串-----》Java对象
        //必须是数组的形式；
        String json = "[\n" +
                "    {\n" +
                "        \"name\":\"张三\",\n" +
                "        \"age\":22,\n" +
                "        \"score\":\"99\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\":\"李四\",\n" +
                "        \"age\":23,\n" +
                "        \"score\":\"98\"\n" +
                "    }\n" +
                "]";
      //  parseArray（json字符串，你要转成的java类.class）.class是一个字节码对象。
        List<HashMap> list = JSONObject.parseArray(json, HashMap.class);//调用parseArray进行解析

        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        //用自定义User类进行，转换

        List<User> users = JSONObject.parseArray(json, User.class);
        for (int i=0;i<users.size();i ++){
            System.out.println(users.get(i));
        }


    }

}
