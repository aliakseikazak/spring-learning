package by.kazak.spring.publicTransportApp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("dispatcher")
public class Dispatcher {
    private Bus bus;
    private Subway subway;
    private Taxi taxi;

    public Dispatcher () {}

    @Autowired
    public Dispatcher (Bus bus, Subway subway, Taxi taxi) {
        this.bus = bus;
        this.subway = subway;
        this.taxi = taxi;
    }

    private String getTravelInfo (Transport transport) {
        return String.format("[INFO] Travel time using %s", transport.getTravelTime());
    }

    public String viewInfo () {
        return getTravelInfo(bus);
    }
}
