package by.kazak.spring.aopExample.services;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    public String greet (String name) {
        String message = String.format("Hello, %s!", name);
        System.out.println(message);
        //throw new RuntimeException("Attention, here exception!"); // for calling afterThrowing method
        return message;
    }
}
