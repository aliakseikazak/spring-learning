package by.kazak.spring.publicTransportApp.beans;

import java.util.ArrayList;
import java.util.List;

public class DispatcherWindow {
    private Transport transport;

    public DispatcherWindow () {}

    public DispatcherWindow (Transport transport) {
        this.transport = transport;
    }

    private void getTravelInfo (Transport transport) {
        System.out.println(String.format("[INFO] Travel time using %s", transport.getTravelTime()));
    }

    public void viewInfo () {
        getTravelInfo(transport);
    }
}
