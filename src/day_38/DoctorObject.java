package day_38;

import static day_38.Doctor.parkingIsFull;


public class DoctorObject {
    public static void main(String[] args) {

        Doctor.clinicName = "Ortodont";
        Doctor.hasParking = true;
        System.out.println(Doctor.clinicName);
        System.out.println(Doctor.hasParking);

        Doctor doctorOne = new Doctor();
        doctorOne.doctorName = "Dr. Mom";
        doctorOne.doctorSalary = 1_200_000;
        System.out.println(doctorOne.doctorName);
        System.out.println(doctorOne.doctorSalary);

        Doctor.clinicClaim();
        parkingIsFull();
        doctorOne.acceptsPatient("Nick");
        doctorOne.performsSurgery();

        System.out.println("*******************************************");
        Doctor doctorTwo = new Doctor("SmileDirect", false, "Dr Shepard", 1_300_000);

        doctorTwo.performsSurgery();
        doctorTwo.acceptsPatient("Jimmy");

        Doctor.clinicClaim();
        parkingIsFull();
        doctorOne.parkingIsFull();


    }
}
