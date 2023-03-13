package day_38;

import static day_38.BasketballPlayer.*;


public class BasketballPlayerObject {
    public static void main(String[] args) {
        endOfMatch();
        System.out.println(anotherStaticImport);
        System.out.println();

        BasketballPlayer playerOne = new BasketballPlayer();

        playerOne.team = "Chicago Bulls";
        playerOne.playerName = "Michael Jordan";
        playerOne.number = 23;
        playerOne.salary = 1000_000;

        playerOne.penaltyShot();
        playerOne.play();
        playerOne.dribble();
        System.out.println();

        BasketballPlayer playerTwo = new BasketballPlayer("Kobe Bryant", "Los Angeles Lakers", 10, 1000_000);
        playerTwo.dribble();
        playerTwo.penaltyShot();
        playerTwo.play();

        gameTime = "15:50";
        gameTime = "25:50";
        System.out.println(gameTime);
        System.out.println(gameTime);


    }
}
