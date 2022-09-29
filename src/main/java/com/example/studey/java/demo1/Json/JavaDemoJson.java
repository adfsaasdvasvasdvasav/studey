package com.example.studey.java.demo1.Json;

import com.alibaba.fastjson.JSONObject;

public class JavaDemoJson {
    public static void main(String[] args){
        //java对象----》json字符串
        //toJSONString方法

        User user =new User("张三",22,99);


        String string = JSONObject.toJSONString(user);

        System.out.println(string);
    }

}
