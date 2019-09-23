package by.kazak.spring.musicApp.core;

import by.kazak.spring.musicApp.beans.Music;
import by.kazak.spring.musicApp.beans.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicAppIOC {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("musicPlayerContextIOC.xml");

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        context.close();
    }
}
