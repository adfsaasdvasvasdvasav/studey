package com.example.studey.java.demo1.GOuzaofangfa;

public class UserTest {

    public static void main(String[] args){

        //无参构造
        User user1 =new User();
        System.out.println("========");
        // 全参构造
        User user=new User(12,"1234","你好你好");
        //将参数取出来
        System.out.println("id："+user.getId()+"用户名："+user.getUsername()+"密码："+user.getPassward() );
        //如果需要改名对象当中的成员变量数据内容，仍然还需要使用setXXX方法；
        user.setId(666);
        System.out.println(user.getId());

    }
}
