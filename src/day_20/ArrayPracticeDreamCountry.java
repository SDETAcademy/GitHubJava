package day_20;

import java.util.Random;

public class ArrayPracticeDreamCountry {
    public static void main(String[] args) {

        /**
         * Given a String[] of countries
         * Please randomly pick a country from your array and print:
         * "Your dream country is " + String[index]
         */

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "Moldova",
                "Norway",
                "Philippines",
                "Japan",
                "Philippines",
                "Bolgaria",
                "Armenia",
                "Belarus",
                "Colombia",
                "Vietnam",
                "Honduras",
                "Indonesia",
                "United States",
                "Ukraine"};

        Random random = new Random();
        int index = random.nextInt(countries.length);

        System.out.println("My dream country is " + countries[index]);

    }
}
