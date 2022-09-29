package com.example.studey.java.demo1.TeZheng.封装this关键字;

/*
注意：
1、对于setter方法来说，不能有返回值类型，参数类型必须跟成员变量对应。
2、对于getter方法来说，不能有参数，返回值类型必须跟成员变量对应。
3、对于基本数据类型中的boolean，它的getter方法必须写成isXxx的形式，setter方法的形式不变。
4、this.成员变量名。注意："通过谁调用的方法，谁就是this"   ，通过student调用的setAge，
那么student就是this，因为this地址值，是跟student地址值是一样的

* */

public class Student {
    private int age;
    private String name;
    private Boolean male;

//set方法，这个成员方法，专门用于向age设置数据。
    public void setAge (int age){
        this.age=age;              //将参数赋值给成员变量；
        System.out.println(this);    //打印this地址值，来跟student地址值进行对比。
    }
//get方法，这个成员方法，专门用于获取age的数据。
    public int getAge (){
        return age;
    }

    public void setName(String name){
        this.name=name;     //将参数赋值给成员变量；
    }
    public String getName (){
        return name;
    }
    public void setMale(Boolean male){
        this.male=male;    //将参数赋值给成员变量；
    }
    public Boolean isMale(){
        return male;
    }

}
