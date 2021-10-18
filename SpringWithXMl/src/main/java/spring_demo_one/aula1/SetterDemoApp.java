package spring_demo_one.aula1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    
    public static void main(String[] args) {
        
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        //close
        context.close();
    }
}