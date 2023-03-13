package day_38;

public class FootballPlayer {


    public String name;
    public static int number;//10 > 15
    public String teamName;
    public String countryName;
    public String position;


    public FootballPlayer(){

    }

    public FootballPlayer(int number){
       this.number = number;
    }


    public static void play(String name){

    }

    public static void pass(){
        FootballPlayer footballPlayer = new FootballPlayer();
        play("Roman");
        FootballPlayer.play("Tatsiana");
        footballPlayer.attack();
    }

    public void attack(){

    }


}




