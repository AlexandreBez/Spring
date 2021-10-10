package spring_demo_one.aula1;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your luck day";
    }
    
}