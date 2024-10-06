package com.example.springapplicationcontextdemo.ContextDemo;

import com.example.springapplicationcontextdemo.Bean.MyBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        System.out.println("MyBean = " + context.getBean(MyBean.class));
    }
}