package com.sprng.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

import static com.sprng.start.Genre.*;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;
    ArrayList<Music> list;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



    @Autowired
    public MusicPlayer(ArrayList<Music> list) {
        this.list = list;
    }

    public String playMusic() {
        Random rand = new Random();
        Genre genre = null;
        int i = rand.nextInt(3);
        if (i == 0){genre = CLASSICAL;}
        if (i == 1){genre = RAP;}
        if (i == 2){genre = ROCK;}
        System.out.println(i);
        switch (genre){
            case CLASSICAL:
                return "Playing: " + list.get(0).getSongs().get(rand.nextInt(3));
            case RAP:
                return "Playing: " + list.get(1).getSongs().get(rand.nextInt(3));
            case ROCK:
                return "Playing: " + list.get(2).getSongs().get(rand.nextInt(3));
        }
        return "";
    }
}
