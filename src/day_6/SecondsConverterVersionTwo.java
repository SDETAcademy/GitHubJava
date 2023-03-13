package day_6;

public class SecondsConverterVersionTwo {
    public static void main(String[] args){


        /**
         * User inputs the number os seconds, and the program should print out the converter time in the following format:
         * hours + minutes + seconds
         */

        int input = 1234;
        int hours; // 3695/3600 = 95
        int minutes; // 95/60 = 1; the remainder 35;
        int seconds;
    /*
        1 min = 60 seconds
        1 hour = 60 minutes
        so 60*60 = 3600;
         */

        //    95


        if(input<0){
            System.out.println("Incorrect input, please try again");
        }else {
            hours = input/3600;
            minutes = (input%3600)/60;
            seconds = (input%3600)%60;
            System.out.println("You have entered + " + input +" " + " number of seconds\nthe result is " + hours +
                    " hours" +" " + minutes + " minutes" + " " + seconds + " seconds");
        }


    }
}
