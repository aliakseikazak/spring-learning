package by.kazak.spring.musicApp.beans;

public class RockMusic implements Music {
    private final static String SONG_NAME = "AC/DC - Highway to hell";

    public RockMusic () {
    }

    public void init () {
        System.out.println(String.format("Initialisation of bean: %s", this.getClass().getSimpleName()));
    }

    public void destroy () {
        System.out.println(String.format("Destruction of bean: %s", this.getClass().getSimpleName()));
    }

    @Override
    public String getSong () {
        return String.format("%s: %s", this.getClass().getSimpleName(), SONG_NAME);
    }
}
