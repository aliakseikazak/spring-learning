package by.kazak.spring.musicApp.core;

import by.kazak.spring.musicApp.beans.RapMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicAppInitDestroy {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "musicPlayerContextInitDestroy.xml");

        RapMusic rapMusic = context.getBean("musicBean", RapMusic.class);
        System.out.println(rapMusic.getSong());

        context.close();
    }
}
