package day_46;

public class MusicObject {
    public static void main(String[] args) {
        BackstreetBoys backstreetBoys = new BackstreetBoys();
        backstreetBoys.doesNotExists();

        backstreetBoys.record();
        RecordingStudio.startRecording();
        backstreetBoys.stopRecording();
    }
}
