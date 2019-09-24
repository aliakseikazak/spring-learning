package by.kazak.spring.musicApp.core;

import by.kazak.spring.musicApp.beans.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicAppSetter {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("musicPlayerContextSetter.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();

        System.out.println(musicPlayer.toString());

        context.close();
    }
}
