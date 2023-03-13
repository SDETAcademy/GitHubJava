package day_39;

public class Vacation {

    public String dates;
    public String destination;
    public String rentalCar;
    public double budget;
    public static boolean isRoundTrip;
    public static double ticketPrice;

    public Vacation(){
    }

    public Vacation(String dates, String destination,
                    String rentalCar, double budget,
                    boolean isRoundTrip, double ticketPrice){
        this.dates = dates;
        this.destination = destination;
        this.rentalCar = rentalCar;
        this.budget = budget;
        Vacation.isRoundTrip = isRoundTrip;
        Vacation.ticketPrice = ticketPrice;
    }


    public void flying(){
        System.out.println("Flying to " + destination);
    }

    public void driving(){
        System.out.println("Driving a rental " + rentalCar + " to the Ocean");
    }

    public void isBudget(){
        if(budget-ticketPrice<0){
            System.out.println("We can not afford this vacation");
        }else{
            System.out.println("Let's go on the dates " + dates);
        }
    }

    public static void endOfVacation(){
        System.out.println("The vacation is over, let's go home");
    }

    public static void extendVacation(){
        System.out.println("Let's stay for a little longer");
    }

}
