package day_5;

public class BarberShop {
    public static void main(String[] args){


        /**
         * Create a program, that will print the price for the haircut depending on the customer:
         * if customer is a child - price = 13.99 + tip + tax
         * if customer is a male - price = 20.99 + tip + tax
         * if customer is a female - price = 24.99 + tip + tax
         * also create an else block for any incorrect input
         * please do not user scanner just yet!!
         *
         */

        String customer = "male";
        double price1 = 13.99;
        double price2 = 20.99;
        double price3 = 24.99;
        double tip = 5;
        double tax = 3;
        double total = 0;

        if(customer.equals("child") || customer.equals("Child")){
            total = price1 + tip + tax;
        }else if(customer.equals("male") || customer.equals("Male")){
            total = price2 + tip + tax;
        }else if(customer.equals("female") || customer.equals("Female")){
            total = price3 + tip + tax;
        }else {
            System.out.println("Incorrect input");
        }
        System.out.println("The total price for the service is " + total);

    }
}
