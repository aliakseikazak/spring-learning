package by.kazak.spring.musicApp.beans;

public class MusicPlayer {
    private Music music;

    public MusicPlayer () {}

    public MusicPlayer (Music music) {
        this.music = music;
    }

    public void setMusic (Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println(String.format("Playing: %s", music.getSong()));
    }
}
