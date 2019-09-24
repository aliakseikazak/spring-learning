package by.kazak.spring.musicApp.beans;

public class RockMusic implements Music {
    private final static String SONG_NAME = "AC/DC - Highway to hell";

    public RockMusic () {
    }

    @Override
    public String getSong () {
        return String.format("%s: %s", this.getClass().getSimpleName(), SONG_NAME);
    }
}
