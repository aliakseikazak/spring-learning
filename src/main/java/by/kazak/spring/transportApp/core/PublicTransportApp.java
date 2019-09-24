package by.kazak.spring.transportApp.core;

import by.kazak.spring.transportApp.beans.Bus;
import by.kazak.spring.transportApp.beans.Dispatcher;
import by.kazak.spring.transportApp.beans.InfoWindow;
import by.kazak.spring.transportApp.beans.Taxi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PublicTransportApp {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("publicTransportContext.xml");

        InfoWindow infoWindow = context.getBean("infoWindow", InfoWindow.class);
        System.out.println(infoWindow);

        Dispatcher dispatcher = context.getBean("dispatcher", Dispatcher.class);
        System.out.println(String.format("Bus name: %s", dispatcher.getName()));
        System.out.println(String.format("Bus speed: %s", dispatcher.getSpeed()));

        Bus firstBus = context.getBean("bus", Bus.class);
        Bus secondBus = context.getBean("bus", Bus.class);
        System.out.println(String.format("Singleton bean 'Bus', created objs are equal: %s", firstBus == secondBus));

        Taxi firstTaxi = context.getBean("taxi", Taxi.class);
        Taxi secondTaxi = context.getBean("taxi", Taxi.class);
        System.out.println(String.format("Prototype bean 'Taxi', created objs are equal: %s", firstTaxi == secondTaxi));

        context.close();
    }
}
