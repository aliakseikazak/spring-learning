package by.kazak.spring.transportAppWithEnum.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Underground implements Transport {
    private List<String> transports = new ArrayList<>();

    {
        transports.add("Subway");
        transports.add("Pipeline");
        transports.add("Premetro");
    }

    public Underground () {
    }

    @Override
    public List<String> getTransports () {
        return transports;
    }
}
