package com.example.studey.java.demo1.Json;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

public class DuiXiang2 {
    public static void main(String [] args){
        String json ="{\n" +
                "    \"accountOwnerType\":1,\n" +
                "    \"accountPurposeType\":2,\n" +
                "    \"bankCardId\":402574108,\n" +
                "    \"iphPayMerchantNo\":11000002131474,\n" +
                "    \"mwalletId\":12000049279412\n" +
                "}";

        HashMap Map = JSONObject.parseObject(json, HashMap.class);

        System.out.println(Map);

    }
}
