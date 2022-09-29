package com.example.studey.java.demo1.Json;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

public class JsonDemoDuiXiang {
    public static void main(String[] args){
        //json字符串-----》Java对象
        //json字符串-----》Java集合
        //Java对象------》json字符串

        // 一个/代表转译,
        //第一步，定义一个json字符串，
        String json ="{\n" +
                "   \"name\":\"张三\",\n" +
                "    \"age\":22,\n" +
                "    \"score\":\"99\"\n" +
                "}";
        //第二部转换为Java类，那么我们没有Java类，有两种办法：第一种新建一个User类；第二种直接用Map类；
        //我们就用Map类，我们用到一个类叫JSONObject类（这个类来自于fastjson包），并且用到她里面的一个方法parseObject，parse就是解析的意思
        //parseObject 的两个参数----》parseObject（json字符串，你要转成的java类.class）.class是一个字节码对象。
        //JSONObject.parseObject();alt+回车，自动转成一个对象.
       //默认是没有范型，所以我们要加上，一般键是string类型，值是object类
        HashMap<String,Object> map = JSONObject.parseObject(json, HashMap.class);
        System.out.println(map);
        System.out.println(map.get("age"));
        System.out.println(map.get("age").equals(0));

        //第二种方法，创建一个User类，将json字符串转换为Java对象。

        User user = JSONObject.parseObject(json, User.class);
        System.out.println(user);
        System.out.println(user.getAge());
        System.out.println(user.getAge()==0);
    }
}
