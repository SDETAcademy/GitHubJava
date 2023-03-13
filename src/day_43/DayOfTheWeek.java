package day_43;

public class DayOfTheWeek {
    public static void main(String[] args) {

        String day = "Mondayt";

        switch (day){
            case "Monday":
                System.out.println("It's Monday");
                break;
                case "Tuesday":
                System.out.println("It's Monday");
                break;
                case "Wednesday":
                System.out.println("It's Monday");
                break;
                case "Thursday":
                System.out.println("It's Monday");
                break;
                case "Friday":
                System.out.println("It's Monday");
                break;
                case "Saturday":
                System.out.println("It's Monday");
                break;
                case "Sunday":
                System.out.println("It's Monday");
                break;
            default:
                throw new NoSuchDayOfTheWeekException("There is no such day as " + day); // will stop the execution of the program
//                System.out.println("Invalid Input"); // will not stop the execution of the program
        }

        System.out.println("Last Statement");

    }
}
