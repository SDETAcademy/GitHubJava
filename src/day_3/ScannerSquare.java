package day_3;

import java.util.Scanner;

public class ScannerSquare {
    public static void main(String[] args){

        /**
         * Print triangle using a character, determined by user
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Please type in your special character");
        String specialCharacter;
        specialCharacter = "@";

        System.out.println("     " + specialCharacter);
        System.out.println("   " + specialCharacter + "   " + specialCharacter);
        System.out.println("  " + specialCharacter + "     " + specialCharacter);
        System.out.println(" " + specialCharacter+specialCharacter+specialCharacter+specialCharacter+specialCharacter
                + specialCharacter+specialCharacter+specialCharacter+specialCharacter + "");



    }
}
