package com.example.studey.java.demo1.List;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println(list.size());
        System.out.println(list.get(1));

        for (int i=0 ;i <list.size();i ++){

            System.out.println(list.get(i));
        }

        System.out.println(JSONObject.toJSONString(list));
    }
}
