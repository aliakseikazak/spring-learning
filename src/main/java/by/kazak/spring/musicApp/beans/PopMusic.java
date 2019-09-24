package by.kazak.spring.musicApp.beans;

public class PopMusic implements Music {
    private final static String SONG_NAME = "Ed Sheeran feat. A Boogie wit da Hoodie, Meek Mill - 1000 Nights";

    private PopMusic () {
    }

    public static PopMusic getPopMusic () {
        return new PopMusic();
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
