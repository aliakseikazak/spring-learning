package by.kazak.tutorialProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vihecle {
    @Autowired
    private Tyre tyre;

    @Override
    public void drive () {
        System.out.println(String.format("Car driving. It has %s", tyre));
    }

    public Tyre getTyre () {
        return tyre;
    }

    public void setTyre (Tyre tyre) {
        this.tyre = tyre;
    }
}
