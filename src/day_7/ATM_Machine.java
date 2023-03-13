package day_7;

public class ATM_Machine {
    public static void main(String[] args){

/**
 * Bank ATM, that will ask you for your pin number, you will have 3 attempts to enter a correct pin, otherwise you will
 * be locked out.
 * If your pin is correct, please specify the amount you would like to withdraw
 * if amount is >1000 - print "The maximum amount you can withdraw is $1000"
 * else print - "Please don't forget your money"
 */

    int expectedPinNumber = 1234;
    int actualPinNumber = 1234;
    double amountOfMoney = 1000.1;
    int attempts = 1;

    if(actualPinNumber==expectedPinNumber && attempts <3){
        if(amountOfMoney<0){
            System.out.println("Invalid amount of money, please try again");
        }else if(amountOfMoney>1000){
            System.out.println("The maximum amount you can withdraw is $1000");
        }else{
            System.out.println("Please don't forget your money");
        }
    }else if(actualPinNumber!=expectedPinNumber){
        attempts++;
        System.out.println("YOu have entered the wrong pin number\n you have " + (3-attempts) + " left");
    }
    }
}
