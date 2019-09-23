package by.kazak.spring.musicPlayer.core;

import by.kazak.spring.musicPlayer.beans.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicAppDI {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("musicPlayerContextDI.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
