package by.kazak.spring.aopExample.services;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    public String greet (String name) {
        return String.format("Hello, %s!", name);
    }
}
