package day_5;

public class WeatherProgram {
    public static void main(String[] args){


        /**
         * Create a program, that will print the following messages:
         * if the temp is below 32F - print "It's freezing outside"
         * if the temp is between 32-45 - print "It's chilly outside"
         * if the temp is between 45-65 - print "it's warm outside"
         * if the temp is between 65-80 - print "it's hot outside"
         * if the temp is between 80-100 - print "it's very hot outside"
         * if the temp is above 100 - print "there is a heat wave outside, stay home please"
         */
        double tempOutside = 89;

        if(tempOutside<32){
            System.out.println("It's freezing outside!");
        }if(tempOutside > 32 && tempOutside <45){
            //    true  +  true = true
            //    true  +  false = false
            //    false +  true  = false
            //    false +  false = false
            System.out.println("It's chilly outside");
        }if(tempOutside>=45 && tempOutside<65){
            System.out.println("It's warm outside");
        }if(tempOutside>=65 && tempOutside<80){
            System.out.println("It's hot outside");
        }if(tempOutside>=80 && tempOutside<=100){
            System.out.println("It's very hot outside");
        }else{
            System.out.println("It's a heat wave outside, stay home please");
        }




    }
}
