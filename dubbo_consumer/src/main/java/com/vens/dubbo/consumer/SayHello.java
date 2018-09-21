package com.vens.dubbo.consumer;

import com.vens.dubbo.service.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/21
 */
public class SayHello {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();
        DubboService demoService = (DubboService) context.getBean("dubboService");

        System.out.println(demoService.sayHello("vens"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
