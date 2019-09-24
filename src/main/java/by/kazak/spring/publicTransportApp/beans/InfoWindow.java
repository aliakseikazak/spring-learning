package by.kazak.spring.publicTransportApp.beans;

import org.springframework.stereotype.Component;

@Component
public class InfoWindow {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private int windowNumber;
    private Dispatcher dispatcher;

    public InfoWindow (Dispatcher dispatcher) {
        this.windowNumber = getRandomNumberInRange();
        this.dispatcher = dispatcher;
    }

    private static int getRandomNumberInRange () {
        return (int) (Math.random() * ((MIN - MAX) + 1)) + MIN;
    }

    @Override
    public String toString () {
        return "InfoWindow{" + "windowNumber=" + windowNumber + ", dispatcher's info=" + dispatcher.viewInfo() + '}';
    }
}
