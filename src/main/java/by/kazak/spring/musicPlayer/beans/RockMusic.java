package by.kazak.spring.musicPlayer.beans;

import by.kazak.spring.musicPlayer.beans.Music;

public class RockMusic implements Music {

    public RockMusic () {
    }

    @Override
    public String getSong () {
        return "Highway to hell";
    }
}
