package com.example.studey.java.demo1.Method;

public class Day0602HaveBackMethod {

    public static void main(String[] args){

       String response = backMethod("code","msg");   //接受一下返回值；
       System.out.println(response);

    }
    public static String backMethod(String req1,String req2){
        String response= req1+req2;

        return response;
    }

}


//注意：1、有返回值的方法必须要加，return; return 表示结束方法。return 后面不能直接写代码。