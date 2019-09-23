package com.epam.spring.core;

import com.epam.spring.beans.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        SimpleBean simpleBean = context.getBean("simpleBean", SimpleBean.class);
        System.out.println(String.format("Hello! My name is '%s'!", simpleBean.getName()));

        context.close();
    }
}
