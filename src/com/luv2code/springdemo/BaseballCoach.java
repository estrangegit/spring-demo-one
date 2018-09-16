package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
    
    // define a private field for each dependency
    private FortuneService fortuneService;
    
    // define a constructor for the dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return this.fortuneService.getFortune();
    }
}
