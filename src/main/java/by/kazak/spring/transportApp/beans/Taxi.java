package by.kazak.spring.transportApp.beans;

import org.springframework.stereotype.Component;

@Component
public class Taxi implements PublicTransport{
    private final static String TIME = "20 minutes";

    public Taxi () {
    }

    @Override
    public String getTravelTime () {
        return String.format("%s: %s", this.getClass().getSimpleName(), TIME);
    }
}
