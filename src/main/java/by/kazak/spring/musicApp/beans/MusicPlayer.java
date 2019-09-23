package by.kazak.spring.musicApp.beans;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer () {}

    public MusicPlayer (Music music) {
        this.music = music;
    }

    public void setMusic (Music music) {
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

    public void playMusic () {
        System.out.println(String.format("Playing: %s", music.getSong()));
    }

    @Override
    public String toString () {
        return "MusicPlayer{" + "name='" + name + '\'' + ", volume=" + volume + '}';
    }
}
