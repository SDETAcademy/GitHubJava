package day_39;

public class SportAccess {
    /**
     * Create at least four instance variables with different access modifiers
     * Create at least four instance methods with different access modifiers
     * Create an object of this class and try to access your variables and methods
     */

    public String sportName;
    protected String athleteName;
    int athleteNumber;
    private String club;


    public void printSportName(){
        System.out.println(sportName);
    }

    protected void printAthleteName(){
        System.out.println(athleteName);
    }

    void printAthleteNumber(){
        System.out.println(athleteNumber);
    }

    private void printClub(){
        System.out.println(club);
    }

}
