package by.kazak.spring.musicApp.beans;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String name;
    private int volume;
    private Music music;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer () {}

    public MusicPlayer (Music music) {
        this.music = music;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getVolume () {
        return volume;
    }

    public void setVolume (int volume) {
        this.volume = volume;
    }

    public void setMusic (Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println(String.format("Playing %s", music.getSong()));
    }

    public void setMusicList (List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList () {
        for (Music music : musicList) {
            System.out.println(String.format("Playing %s", music.getSong()));
        }
    }

    @Override
    public String toString () {
        return "MusicPlayer{" + "name='" + name + '\'' + ", volume=" + volume + '}';
    }
}
