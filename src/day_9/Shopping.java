package day_9;

import java.util.Random;

public class Shopping {

    public static void main(String[] args) {

        /**
         Create a program for online shopping. Try to use random class where possible(including a random item picker).
         Also don't forget about invalid input from the user's side.
         Create:
         String Variables: searchBar, itemName and size
         Numberic Variables(use data type of your choice): price, numberOfItems
         Char variable for gender
         Boolean variable isInStock
         */


        String itemName = "none";

        Random random = new Random();
        int randomItemPicker = random.nextInt(4);
        int price = random.nextInt(30);
        int numberOfItems = random.nextInt(3);
        char gender = 'F';
        boolean isInStock = true;
        String searchBar = "none";
        double totalPrice = 0;

        if (randomItemPicker == 0) {
            itemName = "Shoes";
        } else if (randomItemPicker == 1) {
            itemName = "Socks";
        } else if (randomItemPicker == 2) {
            itemName = "Chocolate";
        } else {
            itemName = "Coffee";
        }

        System.out.println(itemName);
        System.out.println(randomItemPicker);

        searchBar = itemName;
        System.out.println("Searching for " + searchBar);

        if (!isInStock || numberOfItems == 0) {
            System.out.println("Sorry we are out of stock");
            price = 0;
            totalPrice = price;
        } else {

            if (gender == 'F') {
                price -= 1;
            }
            totalPrice = price*numberOfItems;
        }
        System.out.println(totalPrice);


    }
}
