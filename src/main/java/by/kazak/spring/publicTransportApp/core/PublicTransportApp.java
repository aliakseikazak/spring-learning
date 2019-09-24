package by.kazak.spring.publicTransportApp.core;

import by.kazak.spring.publicTransportApp.beans.InfoWindow;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PublicTransportApp {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("publicTransportContext.xml");

        InfoWindow infoWindow = context.getBean("infoWindow", InfoWindow.class);
        System.out.println(infoWindow);

        context.close();
    }
}
