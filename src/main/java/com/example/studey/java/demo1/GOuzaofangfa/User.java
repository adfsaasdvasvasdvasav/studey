package com.example.studey.java.demo1.GOuzaofangfa;
/*

//1、构造方法与类同名，就连大小写也要一样，
// 2、构造方法不写返回值类型，就连void都不写
//3、构造方法不能return一个返回值。
4、构造方法也是可以进行重载的；     重载：方法名称相同，参数列表不同；
5、一个标准类的写法，由四个部分组成：所有的成员变量用private关键字修饰；无参构造；全参构造；一对Getter、Setter方法。
这样的标准的类叫做Java bean
6、如何快速生成Gutter、Setter方法；  无参数的构造方法，与全参数的构造方法都可以生成；  code---》generate生成
*/

 /*格式：
public 类名称 （参数类型 参数名称）{
方法体
}
 */
//构造有参，必须要写无参数

public class User {
   private int id;
   private String username;
   private String passward;

    //无参构造方法；
    public User(){
        System.out.println("构造方法执行啦！");
    }
    //全参构造方法；
    public User (int id,String username,String passward){    //写有参构造的时候，要习惯加上无参构造；
        this.id=id;
        this.passward=passward;
        this.username=username;    //this 关键字强行指向成员变量；区别参数和成员变量同名；将参数赋值给成员变量。
       System.out.println("构造方法执行啦！");
    }
    //Getter、Setter 方法
    public void setId (int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassward(String passward){
        this.passward=passward;
    }
    public String getPassward(){
        return passward;
    }


}
