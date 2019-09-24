package by.kazak.spring.musicApp.beans;

public class AlternativeMusic implements Music {

    public AlternativeMusic () {
    }

    @Override
    public String getSong () {
        return String.format("%s: Five Finger Death Punch - Wash it all away", this.getClass().getSimpleName());
    }
}
