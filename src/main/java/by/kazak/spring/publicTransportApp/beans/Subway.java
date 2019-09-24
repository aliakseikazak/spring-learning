package by.kazak.spring.publicTransportApp.beans;

import org.springframework.stereotype.Component;

@Component
public class Subway implements Transport {
    private final static String TIME = "29 minutes";

    public Subway () {
    }

    @Override
    public String getTravelTime () {
        return String.format("%s: %s", this.getClass().getSimpleName(), TIME);
    }
}
