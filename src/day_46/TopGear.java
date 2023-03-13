package day_46;

public class TopGear extends TVShow {

    @Override
    public void watch() {
        System.out.println("Watching Top Gear in TopGear Class");
    }

    public static void episodeNumber() { // method hiding
        System.out.println("Episode #" + episode + " in TopGear Class");
    }


}
