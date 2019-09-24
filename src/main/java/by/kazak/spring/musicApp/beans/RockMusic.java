package by.kazak.spring.musicApp.beans;

public class RockMusic implements Music {

    public RockMusic () {
    }

    @Override
    public String getSong () {
        return String.format("%s: AC/DC - Highway to hell", this.getClass().getSimpleName());
    }
}
