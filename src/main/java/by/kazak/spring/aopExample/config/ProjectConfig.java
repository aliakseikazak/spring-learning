package by.kazak.spring.aopExample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"by/kazak/spring/aopExample/services", "by/kazak/spring/aopExample/aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {}
