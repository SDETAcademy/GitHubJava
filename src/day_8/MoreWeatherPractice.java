package day_8;

import java.util.Random;

public class MoreWeatherPractice {
    public static void main(String[] args) {


        /***
         * create 2 random int variables isSnowing and isRaining;
         * if the random number is 0 set weatherRain = false and weatherSnow = false
         * else set them to true;
         */
        Random random = new Random();
        int isRaining = random.nextInt(2);
        int isSnowing = random.nextInt(2);
        boolean weatherRain = false;
        boolean weatherSnow = false;
        System.out.println(isRaining);
        System.out.println(isSnowing);

        weatherRain = (isRaining == 0) ? false : true;
        System.out.println(weatherRain);
        weatherSnow = (isSnowing == 0) ? false : true;
        System.out.println(weatherSnow);

    }
}
