package by.kazak.spring.musicPlayer.beans;

public class MusicPlayer {
        private Music music;

    public MusicPlayer (Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println(String.format("Playing: %s", music.getSong()));
    }
}
