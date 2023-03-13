package day_46;

public class Vacation {

    public String vacationHotel;
    public int vacationDuration;

    public Vacation(){}
    public Vacation(String vacationHotel, int vacationDuration){
        this.vacationHotel = vacationHotel;
        this.vacationDuration = vacationDuration;
    }

    public void relaxing(){
        System.out.println("Relaxing in " + vacationHotel + " hotel");
    }

    public static void endOfVacation(){
        System.out.println("We have to go back home");
    }

    public void daysRemaining(){
        System.out.println("We have " + vacationDuration + " days left to enjoy");
    }

}
