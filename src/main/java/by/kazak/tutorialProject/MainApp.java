package by.kazak.tutorialProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main (String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car car = context.getBean("car", Car.class);
        car.drive();

    }
}
