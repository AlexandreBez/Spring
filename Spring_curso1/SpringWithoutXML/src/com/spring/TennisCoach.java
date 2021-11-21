package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component //("thatSillyCoach")
// @Scope("prototype")
public class TennisCoach implements Coach{
    
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public  TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    //init
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("init method");
    } 

    //destroy
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("destroy method");
    } 

    // @Autowired
    // public void doSomeCrazyStuff(FortuneService theFortuneService) {
    //     System.out.println("inside the method");
    //     fortuneService = theFortuneService;
    // }

    // @Autowired
    // public void setFortuneService(FortuneService theFortuneService) {
    //     System.out.println("inside the method");
    //     fortuneService = theFortuneService;
    // }

    // @Autowired
    // public TennisCoach(FortuneService theFortuneService) {
    //     fortuneService = theFortuneService;
    // }

    @Override
    public String getDailyWorkout() {
        return "Practice volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}