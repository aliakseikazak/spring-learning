package by.kazak.spring.musicApp.core;

import by.kazak.spring.musicApp.beans.PopMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicAppFactory {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("musicPlayerContextFactory.xml");

        PopMusic popMusic = context.getBean("musicBean", PopMusic.class);
        System.out.println(popMusic.getSong());

        context.close();
    }
}
