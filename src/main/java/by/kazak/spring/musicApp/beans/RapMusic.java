package by.kazak.spring.musicApp.beans;

public class RapMusic implements Music {
    private final static String SONG_NAME = "Eminem - Lose yourself";

    public RapMusic () {
    }

    @Override
    public String getSong () {
        return String.format("%s: %s", this.getClass().getSimpleName(), SONG_NAME);
    }
}
