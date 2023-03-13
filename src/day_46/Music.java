package day_46;

public abstract class Music {
    public String artist;

    public void printArtist(){
        System.out.println("Artist is " + artist);
    }

    public abstract void doesNotExists();

}
