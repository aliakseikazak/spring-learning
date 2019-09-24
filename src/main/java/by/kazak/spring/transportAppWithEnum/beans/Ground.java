package by.kazak.spring.transportAppWithEnum.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Ground implements Transport {
    private List<String> transports = new ArrayList<>();

    {
        transports.add("Bus");
        transports.add("Taxi");
        transports.add("TrolleyBus");
    }

    public Ground () {
    }

    @Override
    public List<String> getTransports () {
        return transports;
    }
}
