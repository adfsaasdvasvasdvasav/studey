package com.example.studey.java.practice;

public class Work {

    public static void main(String[] args){
        String result = method("code","msg");
        System.out.println(result);
        int result1 =methd(12,14) ;
        System.out.println(result1 );
        String [] array ={"你好","中国","加油"};
        String [] aaa =new String[5];
        for (int i = 0; i<=array.length; i++){
            System.out.println(array[i]);
        }

    }
    public static String method (String rep1,String rep2){
        String response = rep1+rep1;
        return response;
    }
    public static int methd(int a,int b){
        int res=a +b ;
        return res;
    }
}
