package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnnotationBeanScopeDemoApp {
    
    public static void main(String[] args) {
        
        //load spring file
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("application.xml");
        
        // retrieve
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check
        boolean result = (theCoach == alphaCoach);

        //print
        System.out.println(result);
        System.out.println(theCoach);
        System.out.println(alphaCoach);

        //close
        context.close();

    }
}