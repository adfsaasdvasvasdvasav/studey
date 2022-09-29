package com.example.studey.java.demo1.Object;

public class PhoneTest1 {
    public static void main(String[] args){

        Phone1 phone1 = new Phone1();
        phone1.prize=12;
        phone1.brand ="苹果";
        phone1.color ="白色";

        System.out.println(phone1.prize );
        System.out.println(phone1.brand );
        System.out.println(phone1.color);

        phone1.call() ;
        phone1.sendMessage();

    }
}
