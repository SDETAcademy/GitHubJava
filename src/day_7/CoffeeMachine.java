package day_7;

public class CoffeeMachine {
    public static void main(String[] args){

        /**
         * Variable: Price, Extras, Drink Name
         * if drink name - "Tea"
         *      if extra - "Milk" - +3$
         *      if extra - "Skim Milk" - + 4$
         *      if there are no extras - no change to the price
         * if drink name - "Coffee"
         *      if extra - "Heavy Cream" - +2.50
         *      if extra - "Half&Half" - +1.95
         *      if there are no extras - no change to the price
         *if drink name is something else - print error message
         */

        double price = 5.00;
        String drinkName = "none";
        String extra = "none";

        if(!drinkName.equals("Tea") && !drinkName.equals("Coffee")){
            System.out.println("Sorry, we are out of stock for your drink");
        }else{
            if(extra.equals("Milk") && drinkName.equals("Tea")){
                System.out.println("You have ordered " + drinkName + " with " + extra
                + " your total is $" + (price+=3));
            }else if(extra.equals("Skim Milk") && drinkName.equals("Tea")){
                System.out.println("You have ordered " + drinkName + " with " + extra
                        + " your total is $" + (price+=4));
            }else if(extra.equals("Heavy Cream") && drinkName.equals("Coffee")){
                System.out.println("You have ordered " + drinkName + " with " + extra
                        + " your total is $" + (price+=2.50));
            }else if(extra.equals("Half&Half") && drinkName.equals("Coffee")){
                System.out.println("You have ordered " + drinkName + " with " + extra
                        + " your total is $" + (price+=1.95));
            }else if(extra.equals("none")){
                System.out.println("You have ordered " + drinkName + " with no extras, your total is $" + price);
            }
            else{
                System.out.println("Sorry, we currently out of " + extra);
            }
        }

    }
}
