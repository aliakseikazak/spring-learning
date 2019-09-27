package by.kazak.tutorialProject;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vihecle {

    @Override
    public void drive () {
        System.out.println("Bus driving");
    }
}
