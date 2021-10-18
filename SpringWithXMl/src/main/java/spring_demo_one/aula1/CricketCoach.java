package spring_demo_one.aula1;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

   /**
    * @return String return the emailAddress
    */
   public String getEmailAddress() {
       return emailAddress;
   }

   /**
    * @param emailAddress the emailAddress to set
    */
   public void setEmailAddress(String emailAddress) {
       this.emailAddress = emailAddress;
   }

   /**
    * @return String return the team
    */
   public String getTeam() {
       return team;
   }

   /**
    * @param team the team to set
    */
   public void setTeam(String team) {
       this.team = team;
   }

    //no-arg construct
    public CricketCoach(){
        System.out.println("n-arg"); 
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getname() {
        return "Leon";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
    
    //setter 
    /**
     * @param fortuneService the fortuneService to set
     */
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter");
        this.fortuneService = fortuneService;
    }

}