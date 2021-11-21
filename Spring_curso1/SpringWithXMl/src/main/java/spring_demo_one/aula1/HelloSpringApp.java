package spring_demo_one.aula1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    
    public static void main(String[] args) {
        
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getname());
        System.out.println(theCoach.getFortune());

        //close the context
        context.close();
    }       
    
}