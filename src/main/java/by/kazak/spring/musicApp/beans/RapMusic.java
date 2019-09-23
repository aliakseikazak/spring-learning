package by.kazak.spring.musicApp.beans;

public class RapMusic implements Music {

    public RapMusic () {
    }

    @Override
    public String getSong () {
        return "Lose yourself";
    }
}
