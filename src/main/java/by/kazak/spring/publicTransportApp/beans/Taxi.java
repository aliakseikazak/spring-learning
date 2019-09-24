package by.kazak.spring.publicTransportApp.beans;

import org.springframework.stereotype.Component;

@Component
public class Taxi implements Transport {
    private final static String TIME = "20 minutes";

    public Taxi () {
    }

    @Override
    public String getTravelTime () {
        return String.format("%s: %s", this.getClass().getSimpleName(), TIME);
    }
}
