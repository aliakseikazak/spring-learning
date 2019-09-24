package by.kazak.spring.transportApp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope ("singleton")
public class Bus implements PublicTransport {
    private final static String TIME = "40 minutes";

    public Bus () {
    }

    @PostConstruct
    public void init () {
        System.out.println(String.format("Initialisation of bean: %s", this.getClass().getSimpleName()));
    }

    @PreDestroy
    public void destroy () {
        System.out.println(String.format("Destruction of bean: %s", this.getClass().getSimpleName()));
    }

    @Override
    public String getTravelTime () {
        return String.format("%s: %s", this.getClass().getSimpleName(), TIME);
    }
}
