package by.kazak.spring.transportAppWithEnum.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Air implements Transport {
    private List<String> transports = new ArrayList<>();

    {
        transports.add("Plane");
        transports.add("Helicopter");
        transports.add("Balloon");
    }

    public Air () {
    }

    @Override
    public List<String> getTransports () {
        return transports;
    }
}
