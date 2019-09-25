package by.kazak.spring.aopExample.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleServiceAspect {

    @Before("execution(* by.kazak.spring.aopExample.services.SimpleService.greet(..))")
    public void before () {
        System.out.println("I'm in the 'before()' method");
    }
}
