package com.example.studey.java.demo1.Method;

public class Day05ForLoop {
    public static void main(String[] args){
        //嵌套循环，
        //打印4行5列的*
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

       //遍历二维数组
    int[][] arry ={{12,23,34,45},{12,34,54,65,34}};
    for(int i=0;i<arry.length;i++){

        for (int j=0;j<arry[i].length;j++){
            System.out.print(arry[i][j]+",");
        }
        System.out.println("");

    }
        int[] [] array1 ={{1,2,3,4,5},{6,7,8,9},{11,22,33,44,55}};
        for (int a=0;a <=array1.length;a++){
            for (int b=0;b<=array1[a].length;b++){
                System.out.print(array1 [a][b]+",");
            }
            System.out.println("");
        }





    }
}
