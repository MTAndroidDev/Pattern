package com.example.yoush.pattern.singleton.classic;

/**
 * Created by maomacheal on 2018/4/7.
 */

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){};

    public static Singleton getInstance(){
        if (uniqueInstance != null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a classic Singleton!";
    }

}
