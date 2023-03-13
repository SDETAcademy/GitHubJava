package day_46;

public class BackstreetBoys extends Music implements RecordingStudio{
    @Override
    public void doesNotExists() {
        super.artist = "Backstreet Boys";
        System.out.println(artist + " is my favorite band!");
    }

    @Override
    public void record() {
        System.out.println("Recording Backstreet Boys at " + RecordingStudio.RECORDING_STUDIO_NAME);
    }
}
