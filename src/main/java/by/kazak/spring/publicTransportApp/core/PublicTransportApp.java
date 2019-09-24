package by.kazak.spring.publicTransportApp.core;

import by.kazak.spring.publicTransportApp.beans.DispatcherWindow;
import by.kazak.spring.publicTransportApp.beans.Transport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PublicTransportApp {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("publicTransportContext.xml");

        Transport bus = context.getBean("bus", Transport.class);

        DispatcherWindow firstDispatcher = new DispatcherWindow(bus);
        firstDispatcher.viewInfo();

        Transport taxi = context.getBean("taxi", Transport.class);

        DispatcherWindow secondDispatcher = new DispatcherWindow(taxi);
        secondDispatcher.viewInfo();

        context.close();
    }
}
