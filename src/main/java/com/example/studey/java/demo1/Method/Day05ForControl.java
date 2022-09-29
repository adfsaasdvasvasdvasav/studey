package com.example.studey.java.demo1.Method;

public class Day05ForControl {

    public static void main(String[] args){

        for (int i=1;i<=10;i++) {

            if (i %3==0){
                break;        //跳出当前循环
              //  continue;   //继续循环
            }
            System.out.println(i);
        }

    }
}
