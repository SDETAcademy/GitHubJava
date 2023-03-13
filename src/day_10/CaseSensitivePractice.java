package day_10;

import java.util.Random;

public class CaseSensitivePractice {

    public static void main(String[] args) {
        /**
         * create int random variable called picker; String sentence = "Today is Saturday"
         * if picker = 0 - print everything to lower case
         * if picker = 1 - print everything to Upper case
         * if picker = 2 - check if sentence contains Saturday
         * if picker = 3 - check if sentence begins with T or D
         * if picker = 4 - check if sentence ends with y or z
         * if picker = 5 - check if sentence begins with t(regardless if it's capital or lower case)
         */
        Random random = new Random(5);

        String sentence = "Today is Saturday";
        int dayPicker = 6;
        if (dayPicker == (0)) {
            System.out.println(sentence.toLowerCase());
        } else if (dayPicker == 1) {
            System.out.println(sentence.toUpperCase());
        } else if (dayPicker ==2) {
            System.out.println(sentence.contains("Saturday"));
        } else if (dayPicker ==3) {
            System.out.println(sentence.startsWith("T") || sentence.startsWith("D"));
        }else if (dayPicker ==4) {
            System.out.println(sentence.endsWith("y") || sentence.endsWith("z"));
        }else if (dayPicker==5) {
            System.out.println(sentence.startsWith("t") || sentence.contains("T"));
        }else{
            System.out.println("invalid");
        }



        }

    }

