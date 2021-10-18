package spring_demo_one.aula1;

public class BaseballCoach implements Coach{
    
    private FortuneService fortuneService;

    public BaseballCoach() {
        System.out.println("n-arg"); 
    }

    public BaseballCoach(FortuneService thefFortuneService) {
        fortuneService = thefFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getname(){
        return "david";
    }

    @Override
    public String getFortune() {
        
        return fortuneService.getFortune();
    }
}