package by.kazak.spring.musicApp.beans;

public class AlternativeMusic implements Music {
    private final static String SONG_NAME = "Five Finger Death Punch - Wash it all away";

    public AlternativeMusic () {
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
