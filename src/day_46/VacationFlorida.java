package day_46;

public class VacationFlorida extends Vacation{
    public String vacationHotel;
    public double flightTicketsPrice;

    public VacationFlorida(){}
    public VacationFlorida(double flightTicketsPrice){
        super("5 Star Hotel", 20);
        this.flightTicketsPrice = flightTicketsPrice;
    }

    public VacationFlorida(String vacationHotel){
        this(900);
    }

    public void getFlightTicketsPrice(){
        System.out.println("The price for the air fare is $" + flightTicketsPrice + " to relax in the hotel " + vacationHotel);
    }

    public void setParentVacationHotel(String vacationHotel){
        super.vacationHotel = vacationHotel;
    }

    public void setDaysNumber(int days){
        super.vacationDuration = days;
    }

    public void printNumberOfDays(){
        super.daysRemaining();
    }

}
