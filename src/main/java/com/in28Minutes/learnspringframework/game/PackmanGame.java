package com.in28Minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PackmanGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("p.up");
    }
    @Override
    public void down(){
        System.out.println("p.up");
    }
    @Override
    public void left(){
        System.out.println("p.up");
    }
    @Override
    public void right(){
        System.out.println("p.up");
    }
}
