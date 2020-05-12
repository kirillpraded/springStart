package com.sprng.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Computer {
    private int ID;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.ID = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ID=" + ID +
                ", musicPlayer=" + musicPlayer.playMusic() +
                '}';
    }
    public String toStringRand() {
        return "Computer{" +
                "ID=" + ID +
                ", musicPlayer=" + musicPlayer.playMusic() +
                '}';
    }
}
