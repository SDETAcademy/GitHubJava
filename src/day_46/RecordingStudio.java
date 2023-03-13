package day_46;

public interface RecordingStudio {
    String RECORDING_STUDIO_NAME = "Jay-Z records";

    void record();
    default void stopRecording(){
        System.out.println("stopping the recording");
    }
    static void startRecording(){
        System.out.println("Recording has started");
    }

}
