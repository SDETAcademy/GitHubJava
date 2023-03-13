package day_38;

public class Doctor {

    public static String clinicName;
    public static boolean hasParking;
    public String doctorName;
    public double doctorSalary;

    /**
     * Create 2 instance variables and 2 static variables
     * Create 2 instance methods and 2 static methods
     * Overload the constractor please
     */

    public Doctor(){

    }

    public Doctor(String clinicName, boolean hasParking, String doctorName, double doctorSalary){
        Doctor.clinicName = clinicName;
        Doctor.hasParking = hasParking;
        this.doctorName = doctorName;
        this.doctorSalary = doctorSalary;

    }

    public void acceptsPatient(String patientName){
        System.out.println(doctorName + " is accepting " + patientName);
    }

    public void performsSurgery(){
        System.out.println(doctorName + " is performing surgery and gets payed " + doctorSalary);
    }

    public static void parkingIsFull(){
        System.out.println("the parking is full and hasParking is " + hasParking);
    }

    public static void clinicClaim(){
        System.out.println(clinicName + " has an outstanding claim");
    }


}
