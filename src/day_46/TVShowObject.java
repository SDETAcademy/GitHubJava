package day_46;

public class TVShowObject {
    public static void main(String[] args) throws InterruptedException {
        TopGear topGear = new TopGear();
        System.out.println(topGear.NAME);

        topGear.watch();
        TopGear.episodeNumber();
        topGear.endOfSeason();
        TopGear.episode = 10;
        try {
            int episodesLeft = 30 / TopGear.episode;
        }catch (ArithmeticException e){
            System.exit(1);
//            e.printStackTrace();
        }finally {
            System.out.println("Finally Block");
        }

        if(TopGear.episode<1){
            throw new NoSuchSomethingException();
        }

        System.out.println("After try/catch block");

        slowTheProgram(5);
        System.out.println("Slowed down");



    }
    public static void slowTheProgram(int secs) throws InterruptedException {
        Thread.sleep(1000*secs);
    }
}
