package com.example.studey.java.demo1.Equals;

public class BIJiao {

    //两个字符串进行对比,equals 是属于Object类下的方法。

    public static void main(String[] args){

        String str1 = "qwe";
        String str2 = "aba";

        //对比用equals方法
        str1.equals(str2) ;
        System.out.println(str1.equals(str2));

        //替换用replace
        String s1 = "我的手机号码是，1344444";
        String s2 = s1.replace("我的手机号码是，1344444","110");
        System.out.println(s2);
        System.out.println(s1);

    }
}
