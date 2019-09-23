package by.kazak.spring.musicApp.core;

import by.kazak.spring.musicApp.beans.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicAppSetter {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("musicPlayerContextSetter.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(String.format("Music player name: %s",musicPlayer.getName()));
        System.out.println(String.format("Music player volume: %d",musicPlayer.getVolume()));

        System.out.println(musicPlayer.toString());

        context.close();
    }
}
