package com.sprng.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerFromCode {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toStringRand());
    }
}
