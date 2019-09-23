package by.kazak.spring.musicPlayer.beans;

public class RockMusic implements Music {

    public RockMusic () {
    }

    @Override
    public String getSong () {
        return "Highway to hell";
    }
}
