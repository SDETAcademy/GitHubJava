package day_17;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        Random random = new Random();

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*\";"; // 3- charactes long
        String password = "";
        int characterPicker;
        int lengthOfPassword = random.nextInt(24); // number of iterations

        if(lengthOfPassword<10){
            lengthOfPassword=10;
        }
        for (int i = 0; i<lengthOfPassword; i++){
            characterPicker = random.nextInt(str.length()); // 71 - length()-1
            password+=str.charAt(characterPicker);
        }

        System.out.println(password);





    }
}
