package by.kazak.spring.aopExample.core;

import by.kazak.spring.aopExample.config.ProjectConfig;
import by.kazak.spring.aopExample.services.SimpleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main (String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            SimpleService service = c.getBean(SimpleService.class);
            String result = service.greet("Aliaksei");
            System.out.println(result);
        }
    }
}
