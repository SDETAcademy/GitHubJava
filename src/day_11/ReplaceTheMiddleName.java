package day_11;

public class ReplaceTheMiddleName {
    public static void main(String[] args){

        String fullName = "Joanne King Rowling";
        //                  Joanne Rosa Rowling
        //                  Erich Maria Remarque
        //                  Erich Rosa Remarque

        /**
         * Create a program, that will replace only the middle name with "Rosa";
         * Bonus points if you can make it dynamic for every first name middle name and last name
         */


        //pseducode - algorithm(plan or blueprint) of solving the task

        String middleName = "Rosa";

        int endOfFirstNameIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0, endOfFirstNameIndex);
        System.out.println(firstName + " " + middleName);

        int beginningOfLastName = fullName.lastIndexOf(" ");
        String lastName = fullName.substring(beginningOfLastName +1);
        String editedLastName = lastName.replace(" ", "");
        System.out.println(editedLastName);
        System.out.println(firstName + " " + middleName + " " + lastName);
        System.out.println(firstName + " " + middleName + " " + editedLastName);





    }
}
