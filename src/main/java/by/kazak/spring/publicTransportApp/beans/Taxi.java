package by.kazak.spring.publicTransportApp.beans;

import org.springframework.stereotype.Component;

@Component
public class Taxi implements Transport {
    private final static String TIME = "20 minutes";

    public Taxi () {
    }

    public void init () {
        System.out.println(String.format("Initialisation of bean: %s", this.getClass().getSimpleName()));
    }

    public void destroy () {
        System.out.println(String.format("Destruction of bean: %s", this.getClass().getSimpleName()));
    }

    @Override
    public String getTravelTime () {
        return String.format("%s: %s", this.getClass().getSimpleName(), TIME);
    }
}
