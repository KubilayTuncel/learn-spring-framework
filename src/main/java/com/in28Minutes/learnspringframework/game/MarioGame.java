package com.in28Minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("m.up");
    }
    public void down(){
        System.out.println("m.up");
    }
    public void left(){
        System.out.println("m.up");
    }
    public void right(){
        System.out.println("m.up");
    }
}
