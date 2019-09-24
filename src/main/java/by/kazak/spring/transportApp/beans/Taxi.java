package by.kazak.spring.transportApp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class Taxi implements PublicTransport {
    private final static String TIME = "20 minutes";

    public Taxi () {
    }

    @Override
    public String getTravelTime () {
        return String.format("%s: %s", this.getClass().getSimpleName(), TIME);
    }
}
