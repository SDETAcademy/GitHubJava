package day_46;

public class Travel {

    private String travelDestination;
    private String travelVehicle;
    private double travelDistance;

    public String getTravelDestination() {
        return travelDestination;
    }

    public void setTravelDestination(String travelDestination) {
        this.travelDestination = travelDestination;
    }

    public String getTravelVehicle() {
        return travelVehicle;
    }

    public void setTravelVehicle(String travelVehicle) {
        this.travelVehicle = travelVehicle;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public void travelingTo(){
        System.out.println("Traveling to " + travelDestination);
    }

    private void secretTravelStop(){
        System.out.println("Secret travel stop is...");
    }

    public void getSecretMethod(){
        secretTravelStop();
    }

}
