package by.kazak.spring.musicApp.core;

import by.kazak.spring.musicApp.beans.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicAppScope {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("musicPlayerContextScope.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(String.format("Two beans (objects) are equal = %b", comparison));

        System.out.println(String.format("First music player: %s", firstMusicPlayer));
        System.out.println(String.format("Second music player: %s", secondMusicPlayer));

        firstMusicPlayer.setVolume(77);

        System.out.println(String.format("First music player volume: %d", firstMusicPlayer.getVolume()));
        System.out.println(String.format("Second music player volume: %d", secondMusicPlayer.getVolume()));

        context.close();
    }
}
