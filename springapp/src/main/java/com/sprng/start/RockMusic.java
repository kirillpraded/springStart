package com.sprng.start;

import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Nirvana";
    }
    @Override
    public ArrayList<String> getSongs() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Fuck Rock");
        list.add("Nirvana");
        list.add("Led Zeppelin");
        return list;
    }
}
