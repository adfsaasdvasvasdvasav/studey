package com.example.studey.java.demo1.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoop {
    public static void main(String[] args){
        Map<String,Integer> hashMap= new HashMap<>();

        hashMap.put("姓名",111);
        hashMap.put("语音",222);
        hashMap.put("身高",555);

        System.out.println(hashMap.size());
        System.out.println(hashMap.get("身高"));
        //遍历
        //增强for循环；
       // for （数据类型  变量名：集合名称）{}
        //1、keySet方法可以获取到健，然后➕get方法就可以打印出来。
        Set<String> keySet = hashMap.keySet();//alt + 回车键自动生成一个返回值   (局部变量)  或者.var
        for (String key:keySet){
            Integer value = hashMap.get(key);
            System.out.println(key+"="+value);
        }

    }
}
