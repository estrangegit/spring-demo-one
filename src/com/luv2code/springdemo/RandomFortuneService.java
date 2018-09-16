package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String fortunes[] = {"fortune 1", "fortune 2", "fortune 3"};    
    @Override
    public String getFortune() {
        Random r = new Random();
        return fortunes[r.nextInt(3)];
    }
}
