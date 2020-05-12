package com.sprng.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingBean {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //MusicPlayer musicPlayer2 =context.getBean("musicPlayer", MusicPlayer.class);
        //System.out.println(musicPlayer == musicPlayer2);
        //System.out.println(musicPlayer.equals(musicPlayer2));
        //musicPlayer.playMusic();
        //Computer computer = context.getBean("computer", Computer.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        //System.out.println(computer.toStringRand(Genre.RAP));
        //System.out.println(musicPlayer.getName() + "            " + musicPlayer.getVolume());
        //context.close();
    }
}
