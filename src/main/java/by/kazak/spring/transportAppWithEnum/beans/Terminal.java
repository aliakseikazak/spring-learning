package by.kazak.spring.transportAppWithEnum.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Terminal {
    private Air air;
    private Ground ground;
    private Marine marine;
    private Underground underground;

    public Terminal () {}

    @Autowired
    public Terminal (Air air, Ground ground, Marine marine, Underground underground) {
        this.air = air;
        this.ground = ground;
        this.marine = marine;
        this.underground = underground;
    }

    private void getInfo (String kind, String transportName) {
        System.out.println(String.format("Random %s kind of transport: %s", kind, transportName));
    }

    public void chooseTransport (TransportKind kind) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (kind == TransportKind.AIR) {
            getInfo(TransportKind.AIR.toString(), air.getTransports().get(randomNumber));
        } else if (kind == TransportKind.GROUND) {
            getInfo(TransportKind.GROUND.toString(), ground.getTransports().get(randomNumber));
        } else if (kind == TransportKind.MARINE) {
            getInfo(TransportKind.MARINE.toString(), marine.getTransports().get(randomNumber));
        } else if (kind == TransportKind.UNDERGROUND) {
            getInfo(TransportKind.UNDERGROUND.toString(), underground.getTransports().get(randomNumber));
        } else {
            System.out.println("No such kind of transport");
        }
    }
}
