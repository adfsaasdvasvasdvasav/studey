package com.example.studey.java.demo1.Method;



//今天来学习二维数组
public class Day02_1 {
    public  static void main(String[] args){

        //1、二维数组，是一维数组的嵌套；
        //静态初始化，类型 [] [] 数组名称 ={{...},{...},{...}};
        String[][] strings ={{"张三","李四"}, {"王明","高翔"}};
        System.out.println(strings[0]);
        System.out.println(strings[0][0]);
        strings[1][1]="黎明";            //修改数组中的某一个值；
        System.out.println(strings[1][1]);
        System.out.println(strings.length);//数组的长度



        //2、动态初始化数组
        String[][] strings1= new String[3][3];


    }
}
