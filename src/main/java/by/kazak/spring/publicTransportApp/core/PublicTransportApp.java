package by.kazak.spring.publicTransportApp.core;

import by.kazak.spring.publicTransportApp.beans.DispatcherWindow;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PublicTransportApp {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("publicTransportContext.xml");

        DispatcherWindow dispatcherWindow = context.getBean("dispatcherWindow", DispatcherWindow.class);
        System.out.println(dispatcherWindow);

        context.close();
    }
}
