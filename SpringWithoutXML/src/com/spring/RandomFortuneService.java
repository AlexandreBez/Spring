package com.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService  implements FortuneService{

    //create array
    private String[] data = {
        "luck 1", 
        "luck 2",
        "luck 3"
    };

    //random generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        
        //pick random luck
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];

        return theFortune;
    }

    
}