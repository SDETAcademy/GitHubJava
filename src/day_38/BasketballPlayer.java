package day_38;

public class BasketballPlayer {

    public int number;
    public String playerName;
    public String team;
    public double salary;
    public static String gameTime;
    public static int anotherStaticImport = 10;

    public BasketballPlayer(){

    }

    public BasketballPlayer(String playerName, String team, int number, double salary){
        this.playerName = playerName;
        this.team = team;
        this.number = number;
        this.salary = salary;
    }

    public void play(){
        System.out.println(playerName + " is playing the game");
    }

    public void dribble(){
        System.out.println(playerName + " is dribbling like a pro");
    }

    public void penaltyShot(){
        System.out.println("Throwing a penalty for a team" + team);
    }

    public static void endOfMatch(){

        System.out.println("The game has ended");
    }



}
