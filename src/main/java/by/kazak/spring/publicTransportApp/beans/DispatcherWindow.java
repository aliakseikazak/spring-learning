package by.kazak.spring.publicTransportApp.beans;

import java.util.ArrayList;
import java.util.List;

public class DispatcherWindow {
    private String modelName;
    private int speed;
    private Transport transport;
    private List<Transport> transportList = new ArrayList<>();

    public DispatcherWindow () {}

    public DispatcherWindow (Transport transport) {
        this.transport = transport;
    }

    public String getModelName () {
        return modelName;
    }

    public void setModelName (String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed () {
        return speed;
    }

    public void setSpeed (int speed) {
        this.speed = speed;
    }

    private void getTravelInfo (Transport transport) {
        System.out.println(String.format("[INFO] Travel time using %s", transport.getTravelTime()));
    }

    public void setTransport (Transport transport) {
        this.transport = transport;
    }

    public void viewInfo () {
        getTravelInfo(transport);
    }

    public void setTransportList (List<Transport> transportList) {
        this.transportList = transportList;
    }

    public void viewFullInfo () {
        for (Transport transport : transportList) {
            getTravelInfo(transport);
        }
    }

    @Override
    public String toString () {
        return "DispatcherWindow{" + "modelName='" + modelName + '\'' + ", speed=" + speed + '}';
    }
}
