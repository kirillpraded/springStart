package com.sprng.start;

import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "BigBabyTape";
    }
    @Override
    public ArrayList<String> getSongs() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Big Baby Tape");
        list.add("Gone Fladd");
        list.add("Boulevard Depo");
        return list;
    }
}
