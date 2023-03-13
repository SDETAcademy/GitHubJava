package day_5;

public class CarDealership {
    public static void main(String[] args){

        /*
        && - and
        || - or
        if this name is something or the name is something else - true
         */

//        String name1 = "Roman";
//        String name2 = "roman";
//        String name3 = "Roman";
//
//
//        if(name1.equals(name2) || name1.equals(name3)){
//            System.out.println("The names match!");
//        }else{
//            System.out.println("The names are not matching!");
//        }
//
//

        /**
         * create a program, that will check the car make and will print the country of manufacturer(NO SCANNER PLS!!!)
         * Example: if car is toyota, or honda - print "Japan"
         * if car is ford or chrysler - print "USA"
         * if car is BMW or Mercedes - print "Germany"
         *
         */

        String actualCarName = "Ferrari";
        String name1 = "Toyota";
        String name2 = "Honda";
        String name3 = "BMW";
        String name4 = "Mercedes";
        String name5 = "Ford";
        String name6 = "Chrysler";

        if(actualCarName.equals(name1) || actualCarName.equals(name2)){
            //     true    +   true  = true
            //     true    +   false = true
            //     false   +   true  = true
            //     false   +   false = false
            System.out.println("The country of manufacturer is - Japan");
        }else if(actualCarName.equals(name3) || actualCarName.equals(name4)){
            System.out.println("The country of manufacturer is - Germany");
        }else if(actualCarName.equals(name5) || actualCarName.equals(name6)){
            System.out.println("The country of manufacturer is - USA");
        }else{
            System.out.println("The manufacturer is unknown");
        }






    }
}
