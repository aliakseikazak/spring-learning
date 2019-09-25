package by.kazak.spring.aopExample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleServiceAspect {

    @Before("execution(* by.kazak.spring.aopExample.services.SimpleService.greet(..))")
    public void before () {
        System.out.println("I'm in the 'before()' method");
    }

    @After ("execution(* by.kazak.spring.aopExample.services.SimpleService.greet(..))")
    public void after () {
        System.out.println("I'm in the 'after()' method");
    }

    @AfterReturning ("execution(* by.kazak.spring.aopExample.services.SimpleService.greet(..))")
    public void afterReturning () {
        System.out.println("I'm in the 'afterReturning()' method");
    }

    @AfterThrowing ("execution(* by.kazak.spring.aopExample.services.SimpleService.greet(..))")
    public void afterThrowing () {
        System.out.println("I'm in the 'afterThrowing()' method");
    }

    /**
     * one of the jointPoint example
     */
    /*@Around("execution(* by.kazak.spring.aopExample.services.SimpleService.greet(..))")
    public Object around (ProceedingJoinPoint joinPoint) {
        System.out.println("I'm in the proceeding join point");
        return "Something to return";
    }*/

    @Around("execution(* by.kazak.spring.aopExample.services.SimpleService.greet(..))")
    public Object around (ProceedingJoinPoint joinPoint) {
        System.out.println("I'm in the proceeding join point");
        Object result = null;
        try {
            result = joinPoint.proceed();
            System.out.println("And now in the try block");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
