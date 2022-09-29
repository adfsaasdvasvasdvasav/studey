package com.example.studey.java.demo1.Object;

public class PhoneTest {
    public static void main(String [] args){

        Phone phone = new Phone();
        phone.size=6;
        phone.price=1;
        phone.brand="三星、苹果";
        System.out.println(phone.size);
        System.out.println(phone.price);
        System.out.println(phone.brand);

        phone.call() ;
        phone.sendMessage() ;
    }
}
