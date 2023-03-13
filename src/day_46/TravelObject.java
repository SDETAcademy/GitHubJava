package day_46;

public class TravelObject {
    public static void main(String[] args) {
        Travel travel = new Travel();
        travel.travelingTo();
        travel.setTravelDestination("Vienna");
        System.out.println(travel.getTravelDestination());
        travel.travelingTo();

        travel.getSecretMethod();
    }
}
