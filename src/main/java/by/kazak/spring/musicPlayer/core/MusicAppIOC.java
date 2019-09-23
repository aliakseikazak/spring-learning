package by.kazak.spring.musicPlayer.core;

import by.kazak.spring.musicPlayer.beans.Music;
import by.kazak.spring.musicPlayer.beans.MusicPlayer;
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
