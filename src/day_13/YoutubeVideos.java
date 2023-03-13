package day_13;

public class YoutubeVideos {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Create a code, that will print an emoji of your favorite animal 20 times
         * Please slow down the execution of the program for 1 sec.
         */

        int count = 0;
        while(count < 20){
            System.out.println("Favorite animal is: \uD83D\uDC2F️" + count);
            count++;
            Thread.sleep(1000);}




    }
}
