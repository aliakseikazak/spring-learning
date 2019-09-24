package by.kazak.spring.transportApp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dispatcher {
    private String name;
    private int speed;

    private PublicTransport firstKindOfTransport;
    private PublicTransport secondKindOfTransport;

    public Dispatcher () {}

    @Autowired
    public Dispatcher (@Qualifier ("bus") PublicTransport firstKindOfTransport,
                       @Qualifier ("taxi") PublicTransport secondKindOfTransport) {
        this.firstKindOfTransport = firstKindOfTransport;
        this.secondKindOfTransport = secondKindOfTransport;
    }

    @Value ("${transport.name}")
    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Value ("${transport.speed}")
    public void setSpeed (int speed) {
        this.speed = speed;
    }

    public int getSpeed () {
        return speed;
    }

    private String getTravelInfo (PublicTransport publicTransport) {
        return String.format("[INFO] Travel time using %s", publicTransport.getTravelTime());
    }

    public String viewInfo () {
        return String.format("%s, %s", getTravelInfo(firstKindOfTransport), getTravelInfo(secondKindOfTransport));
    }
}
