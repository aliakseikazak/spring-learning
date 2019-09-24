package by.kazak.spring.transportApp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dispatcher {
    private PublicTransport firstKindOfTransport;
    private PublicTransport secondKindOfTransport;

    public Dispatcher () {}

    @Autowired
    public Dispatcher (@Qualifier ("bus") PublicTransport firstKindOfTransport,
                       @Qualifier ("taxi") PublicTransport secondKindOfTransport) {
        this.firstKindOfTransport = firstKindOfTransport;
        this.secondKindOfTransport = secondKindOfTransport;
    }

    private String getTravelInfo (PublicTransport publicTransport) {
        return String.format("[INFO] Travel time using %s", publicTransport.getTravelTime());
    }

    public String viewInfo () {
        return String.format("%s, %s", getTravelInfo(firstKindOfTransport), getTravelInfo(secondKindOfTransport));
    }
}
