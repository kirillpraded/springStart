package com.sprng.start;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;


public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Rhapsody";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization...");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroying...");
    }

    @Override
    public ArrayList<String> getSongs() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rhapsody");
        list.add("Some Classical Track");
        list.add("shiiiiittttt");
        return list;
    }
}
