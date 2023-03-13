package day_7;

import java.util.Random;

public class BlackJack {
    public static void main(String[] args){


        /**
         * In blackjack after the player asks to keep the house 4 things may happen.
         *
         * 1. if the card total is bigger then 21 the player busts.
         *
         * 2. if the house score is bigger then the player, the player loses .
         *
         * 3. if the player score is equal to the house then they are a draw.
         *
         * 4. if the player score is bigger then the house the player wins.
         *
         * player and house scores are represented by  player and house int variables.
         *
         * check them using ifs to determine the result.
         * Please keep in mind boundary testing and possible invalid inputs
         *
         *
         */

        //Random class in Java - allows Java to pick the random number for us, we just need to setup the upper limit

        Random random = new Random();
        int player = random.nextInt(33);
        // We are the player
        System.out.println("Player has " + player + " points");
        int house = random.nextInt(33);
        // This is a casino
        System.out.println("House has " + house + " points");

        if(player <0 || house <0 || player > 31 || house > 31){
            System.out.println("Invalid input");
        }else if(player>house && player <= 21 || house > 21){
            //    1 condition                    2nd condition
            System.out.println("Player wins");
        }else if(player == house){
            System.out.println("It's a draw");
        }else if(player < house || player > 21){
            System.out.println("Player lost");
        }










    }
}
