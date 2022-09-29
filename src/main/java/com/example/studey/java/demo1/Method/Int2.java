package com.example.studey.java.demo1.Method;

public class Int2 {
    public static void main(String[] args){

        int [] ints1 =new int[8];  //动态数组
        int[] ints2 ={12,22,33,44};

        System.out.println(ints2.length);
        System.out.println(ints2[1]);
        for (int i=0;i <ints2.length;i ++){
            System.out.println(ints2 [i]);
        }

        System.out.println("=========");

        //二维数组
        int[] [] ints3 ={{11,12,13,14,15},{11,22,33,44}};
        System.out.println(ints3[1][2]);
        System.out.println(ints3.length);
        for (int i=0;i <ints3.length;i ++){
            for (int j=0;j<ints3[i ].length;j++){
                System.out.println(ints3 [i][j]);
            }

        }

    }
}
