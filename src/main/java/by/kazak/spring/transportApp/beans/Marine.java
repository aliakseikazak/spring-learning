package by.kazak.spring.publicTransportApp.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Marine implements Transport {
    private List<String> transports = new ArrayList<>();

    {
        transports.add("Boat");
        transports.add("Ship");
    }

    public Marine () {
    }

    @Override
    public List<String> getTransports () {
        return transports;
    }
}
