package by.kazak.spring.musicApp.beans;

public class AlternativeMusic implements Music {
    private final static String SONG_NAME = "Five Finger Death Punch - Wash it all away";

    public AlternativeMusic () {
    }

    @Override
    public String getSong () {
        return String.format("%s: %s", this.getClass().getSimpleName(), SONG_NAME);
    }
}
