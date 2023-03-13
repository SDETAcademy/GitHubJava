package day_3;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String name;
        String startingDate;
        String endDate;
        String managerName;
        int employeeId;
        byte age;
        long phoneNumber;
        double salary;
        String documentName = "********Employee ID******";


        System.out.println("Hello End User!!!\nPlease enter your name");
        name = in.nextLine();
        System.out.println("What is your starting date?");
        startingDate = in.nextLine();
        System.out.println("When is your End Date?");
        endDate = in.nextLine();
        System.out.println("what is your managers name?");
        managerName = in.nextLine();
        System.out.println("What is your employee ID?");
        employeeId = in.nextInt();
        System.out.println("What is your age?");
        age = in.nextByte();
        System.out.println("What is your phone number?");
        phoneNumber = in.nextLong();
        System.out.println("What is your salary?");
        salary = in.nextDouble();

        System.out.println("******************************");
        System.out.println("******" + documentName + "***********");
        System.out.println("******************************");
        System.out.println("Employee name: " + name);
        System.out.println("Employee age: " + age);
        System.out.println("Employee salary: " + salary);
        System.out.println("Employee name: " + name);
        System.out.println("Employee phone number: " + phoneNumber);
        System.out.println("Employee start date: " + startingDate);
        System.out.println("Employee end date: " + endDate);
        System.out.println("EmployeeId: " + employeeId);
        System.out.println("Managers Name: " + managerName);

















    }
}
