package com.example.studey.java.demo1.Method;

public class Int4 {
    public static void main(String[] args){

        int[] [] ints = {{2,2,2,2,2},{3,3,3,3,3,3}};

        ints[0][1]=12;

        System.out.println(ints.length);
        System.out.println(ints[0][0]);

        for (int i=0;i <ints.length;i ++){
            for (int j=0;j<ints[i].length;j++){
                System.out.println(ints[i][j]);
            }

        }


    }
}
