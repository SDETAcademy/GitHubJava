package day_8;

import java.util.Random;

public class WeatherHomework {
    public static void main(String[] args) {

        /**
         * Create a class named Wardrobe(Please try to use Random class for your temperature variable).
         * if the temperature outside is bellow 32, the weather is "Winter"
         *     if isSnowing is true, print - "Please take your gloves, so you can make a snowman"
         *     if isSnowing is false, print - "No snow outside, you don't need gloves"
         * if the temperature outside is between 32 and 65 and the weather is "Spring" - print "It's warm outside, you don't need a hat"
         * if the temperature outside is between 32 and 65 and the weather is "Fall" - print "It's getting cold outside, you need a hat"
         * if the temperature is above 65 then the weather is "Summer":
         *     if isRaining is false - print "Enjoy your sunny day"
         *     if the isRaining is true - print "Don't forget the umbrella"
         */

        Random random = new Random();


        int temp = random.nextInt(110);
        int weatherPicker = random.nextInt(4);
        String weather = "Nothing";
        boolean isSnowing = random.nextBoolean();
        boolean isRaining = random.nextBoolean();
        System.out.println(temp);
        System.out.println(isSnowing);
        System.out.println(isRaining);
        System.out.println(weatherPicker);

        if(weatherPicker==0){
            weather = "Winter";
        }else if(weatherPicker==1){
            weather = "Spring";
        }else if(weatherPicker == 2){
            weather = "Summer";
        }else if(weatherPicker==3){
            weather = "Fall";
        }else{
            System.out.println("Wrong input");
        }



        if(temp<32 && weather.equals("Winter")){
            if(isSnowing){
                System.out.println("Please take your gloves, so you can make a snowman");
            }else{
                System.out.println("No snow outside, you don't need gloves");
            }
        }else if(temp>=32 && temp <65 && weather.equals("Spring")){
            System.out.println("It's warm outside, you don't need a hat");
        }else if(temp>=32 && temp <65 && weather.equals("Fall")){
            System.out.println("It's getting cold outside, you need a hat");
        }else if(temp>=65 && weather.equals("Summer")){
            if (isRaining){
                System.out.println("Don't forget the umbrella");
            }else{
                System.out.println("Enjoy your sunny day");
            }
        }else{
            System.out.println("The weather is abnormal, please check outside before you leave your house");
        }
    }
}
