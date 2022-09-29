package com.example.studey.java.demo1.propertise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiseTest {

    //抛出Exception，Exception是所有异常的父类。

    public static void main(String[] args)  {

        //Properties类跟hashmap类是兄弟，都继承map
        Properties pro =new Properties();

        //相对路径：src/main/resources/config.properties    从某个参照物开始的
        //绝对路径：/Users/curry/Downloads/code/studay/src/main/resources/config.properties   从头盘符开始的

        //创建 流对象
//        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        //load去读取文件内容
//        pro.load(fis);  //load需要传一个流对象
//        System.out.println(pro);
        //IO流   Input输入   Output输出   ，是用Java去操作配置文件的

        //方法二，用try  catch解决异常
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            pro.load(fis);
        } catch (Exception e) {   //catch是，异常出现之后的补救措施。
        }

        System.out.println(pro);


    }
}
