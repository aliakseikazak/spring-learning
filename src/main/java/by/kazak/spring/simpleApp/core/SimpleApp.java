package by.kazak.spring.simpleApp.core;

import by.kazak.spring.simpleApp.beans.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleApp {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("simpleAppContext.xml");

        SimpleBean simpleBean = context.getBean("simpleBean", SimpleBean.class);
        System.out.println(String.format("Hello! My name is '%s'!", simpleBean.getName()));

        context.close();
    }
}
