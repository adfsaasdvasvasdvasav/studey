package com.example.studey.java.demo1.Method;

public class Int01 {
    public static void main(String[] args){

        int[] ints = {12,12,23,23};  //一维数组
        int[] ints1 = new int[3];
        ints1[0]=12;

        System.out.println(ints.length);
        System.out.println(ints[0]);
        for (int i=0;i <ints.length;i ++){  //一维数组遍历
            System.out.println(ints[i]);
        }
        int [] [] ints2 = {{1,2,3,4},{12,13,14,15}};
        
        System.out.println(ints2.length);
        System.out.println(ints2 [1][2]);
        for (int a=0;a< ints2.length ;a ++ ){
            for (int b=0;b<ints2[a].length;b ++){
                System.out.println(ints2[a][b]);
            }

        }
    }
}
