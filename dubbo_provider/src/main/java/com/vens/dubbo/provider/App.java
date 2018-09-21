package com.vens.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/21
 */
public class App {
    public static void main(String []args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        try {
            System.in.read();	// 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
