package com.example.studey.java.practice;

public class P1 {
    public static void main(String[] args){

        int[] ages={12,12,12,12,23,23};
        System.out.println(ages[2]);
        ages[2]=44;
        System.out.println(ages.length);
        int[] ages1= new int[5];
        String [][] strings={{"jfk","jadsfdk","ahja","asd"},{"ajd","fa","da"}};
        System.out.println(strings.length);
        System.out.println(strings[0][1]);
        strings[1][1]="nihao";

        int age =11;
        if (age>10){
            System.out.println("你好");
        }
        System.out.println("Java");

        if (age>11&&age<33){
            System.out.println("健身");
        }else {
            System.out.println("不健身");
        }

    }
}
