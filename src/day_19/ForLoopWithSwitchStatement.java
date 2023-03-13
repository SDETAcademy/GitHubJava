package day_19;

public class ForLoopWithSwitchStatement {
    public static void main(String[] args) {


        /**
         * Create a for loop that will iterate from 1-8
         * create a switch statement inside of the loop.
         * if i = 1 - print Monday
         * if i = 2 - print Tuesday
         * .................
         * if i =7 - print Sunday
         * if i = 8 - print There is no such day
         */

        for (int i = 1; i < 9; i++) {
            switch (i){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                case 8:
                    System.out.println("Wrong");
                    break;
                default:
                    System.out.println("Unexpected input");

            }

        }







    }
}
