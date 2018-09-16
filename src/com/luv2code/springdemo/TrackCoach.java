package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    // define a private field for each dependency
    private FortuneService fortuneService;
    
    public TrackCoach() {
        
    }
    
    // define a constructor for the dependency injection    
    public TrackCoach( FortuneService fortuneService ) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

}
