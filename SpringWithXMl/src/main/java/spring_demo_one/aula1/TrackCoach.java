package spring_demo_one.aula1;

public class TrackCoach implements Coach{
    
    private FortuneService fortuneService;

    public TrackCoach(){
        System.out.println("n-arg"); 
    }

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5K";
    }

    @Override
    public String getname(){
        return "Maria";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    //add init method
    public void doMyStartuoStuff(){
        System.out.println("init method");
    }

    //add destroy method

    public void doMyCleanupStuff(){
        System.out.println("destroy method");
    }
}