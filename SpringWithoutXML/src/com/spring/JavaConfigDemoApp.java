package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {
    
    public static void main(String[] args) {
     
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(SportConfig.class);
    
        //Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}