package by.kazak.spring.musicApp.beans;

public class RapMusic implements Music {

    public RapMusic () {
    }

    @Override
    public String getSong () {
        return String.format("%s: Eminem - Lose yourself", this.getClass().getSimpleName());
    }
}
