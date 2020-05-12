package com.sprng.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.MissingFormatArgumentException;
import java.util.Random;

@Configuration
@ComponentScan("com.sprng.start")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return  new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public ArrayList<Music> music(){
        ArrayList<Music> list = new ArrayList<>();
        list.add(classicalMusic());
        list.add(rapMusic());
        list.add(rockMusic());
        return list;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(music());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }


}
