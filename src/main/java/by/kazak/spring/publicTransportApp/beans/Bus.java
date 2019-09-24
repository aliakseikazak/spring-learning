package by.kazak.spring.publicTransportApp.beans;

import org.springframework.stereotype.Component;

@Component("bus")
public class Bus implements Transport {
    private final static String TIME = "40 minutes";

    public Bus () {
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
