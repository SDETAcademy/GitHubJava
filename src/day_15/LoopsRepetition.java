package day_15;


import java.util.Scanner;

public class LoopsRepetition {
    public static void main(String[] args) {

        /**
         * The task is called Zombie attack!
         * 1. We take int input from the user using Scanner( you can name your variable healthyPopulation)
         * 2. int day.
         * every day the number of healthy population is divided by half.
         * Please print how many days it will take to extinct the entire population
         */

        Scanner in = new Scanner(System.in);
        int day = 1;
        int healthyPopulation = in.nextInt();// 20 - until this number is 0, we will keep looping

        while (healthyPopulation>0){
            System.out.println("Day " + day + "[" + healthyPopulation + "]");
            healthyPopulation/=2;
            day++;
        }
        System.out.println("----- EXTINCT -----");


    }
}
