package spring_demo_one.aula1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopedemoApp {
    
    public static void main(String[] args) {
        
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same
        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        //close

        context.close();
    }
}

