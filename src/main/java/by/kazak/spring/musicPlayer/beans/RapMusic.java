package by.kazak.spring.musicPlayer.beans;

import by.kazak.spring.musicPlayer.beans.Music;

public class RapMusic implements Music {

    public RapMusic () {
    }

    @Override
    public String getSong () {
        return "Lose yourself";
    }
}
