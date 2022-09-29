package com.example.studey.java.demo1.Method;

public class Int3 {
    public static void main(String [] args){

        int[][]  ints = {{12,13,14,15},{11,22,33,44}};
        int[] ints1 =new int[5];

        System.out.println(ints.length);
        System.out.println(ints[1]);

        for (int i=0;i<ints.length;i ++) {
            for (int j=0;j<ints[i].length;j++){
                System.out.println("输出的数组为："+ints[i][j]);
            }
        }
        }

    }
