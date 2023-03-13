package day_5;

public class LeapYear {
    public static void main(String[] args){

        /**
         *Create a program, that will accept a year and will determine if that year is leap year - has 366 days;
         */

        int year = 2023;

        if(year % 4 == 0){
            System.out.println("This is a leap year");
        }else if (year%4==0){
            System.out.println("It is not a leap year");
        }


        String name1 = "Kate";
        String name2 = "kate";


        if(name1.equals(name2)){
            System.out.println("Name is matching");
        }
        else if (!name1.equals(name2)){
            System.out.println("the name is not matching");
        }






    }
}
