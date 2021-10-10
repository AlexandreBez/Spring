package spring_demo_one.aula1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycledemoApp {
    
    public static void main(String[] args) {
        
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        //close

        context.close();
    }
}

