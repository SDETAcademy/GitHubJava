package day_46;

public class TVShow {
    public final String NAME = "Top Gear";
    public static int episode;

    public void watch(){
        System.out.println("Watching Top Gear");
    }

    public static void episodeNumber(){
        System.out.println("Episode #" + episode);
    }

    public final void endOfSeason(){
        System.out.println("The season has ended");
    }

}
