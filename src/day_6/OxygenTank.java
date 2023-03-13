package day_6;

public class OxygenTank {
    public static void main(String[] args) {

/**
 * You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
 *                 Above 90 -  Your tank is full
 *                 Above 80 but less than 90 -  Still okay
 *                 Above 70 but less than 80 -  Don't go too far
 *                 Above 60 but less than 70 -  Start to head back
 *                 Above 50 but less than 60 -  Be careful now you at 50%
 *                 less than 50 - get out of the water immediately!*
 */

        byte oxygen = 110;

        if(oxygen >= 90 && oxygen < 100){
            System.out.println("Your tank is full");
        }else if(oxygen >= 80 && oxygen < 90){
            System.out.println("Still OK");
        }else if(oxygen >= 70 && oxygen < 80){
            System.out.println("Do not go too far");
        }else if(oxygen >= 60 && oxygen < 70){
            System.out.println("Start to head back");
        }else if(oxygen >= 50 && oxygen < 60){
            System.out.println("Be careful. You are at 50%");
        }else if(oxygen < 50 && oxygen >=0){
            System.out.println("get out immediately");
        }else {
            System.out.println("Error");
        }





    }
}

