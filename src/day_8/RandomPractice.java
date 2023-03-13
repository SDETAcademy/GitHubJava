package day_8;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {

        Random random = new Random();
        int temperature = random.nextInt(99);
        boolean isRaining = random.nextBoolean();
        // 0 - 9;
        System.out.println(temperature);
        System.out.println(isRaining);

    }
}
