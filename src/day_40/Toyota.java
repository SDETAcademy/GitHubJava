package day_40;

public class Toyota extends Car{
    public void driveYourDream(){
        System.out.println("Driving the most reliable car");
    }

    public static void main(String[] args) {
        Toyota toyota = new Toyota(); // Toyota and Car - Is-A relationship
        Engine engine = new Engine();// Toyota and Engine - HAS-A relationship
        engine.engineRuns();
    }
}
