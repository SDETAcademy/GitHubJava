package day_15;

import java.util.Scanner;

public class ListOfGuests {
    public static void main(String[] args) {


        /**
         *Create String variables: name, listOfGuests, answer
         * We will ask user if he/she wants to add more guests to the list, if yes add the name of the guest.
         * Keep looping until the user doesn't want to add any more people to his/her party
         * at the end - print the list of Guests.
         */
        Scanner in = new Scanner(System.in);

        String name = "";
        String listOfGuest = "";// adding name of guests in here
        String answer = "";


        do {
            System.out.println("Please enter the guest name:");
            name = in.next();
            System.out.println("Do you want to add more guests?");
            answer = in.next();
            listOfGuest += name;

            if(answer.equalsIgnoreCase("yes")){
                listOfGuest+=", ";
            }



        }while(answer.equalsIgnoreCase("yes"));
        System.out.println("Guest list: " + listOfGuest);



    }

}
