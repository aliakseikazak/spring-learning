package by.kazak.spring.transportApp.beans;

import org.springframework.stereotype.Component;

@Component
public class Bus implements PublicTransport {
    private final static String TIME = "40 minutes";

    public Bus () {
    }

    @Override
    public String getTravelTime () {
        return String.format("%s: %s", this.getClass().getSimpleName(), TIME);
    }
}
