package day_6;

public class AIAnsweringMachine {
    public static void main(String[] args){

        /**
         * Create a program, that will determine the language base on the "Hello" word.
         * Any invalid input by the user, please print an error message
         *
         * if str = "Hello" or "Hi" - print "The language is English"
         * if str = "Pruvit" or "Zdorov"- print "The language is Ukrainian"
         * if str = "Salut" or "Ce Faci" - print "The language is Romanian"
         * if str = "Hola" or "Como Esta" - print "the language is Spanish"
         * if str = "Zdravo" or "Kako Si" - print "the language is Serbian"
         * any other input, please print "I'm sorry, I don't speak this language yet"
         * str.equals("something")...
         */


        String str = "Hello";

        if(str.equals("Hello") || str.equals("Hi")){
            System.out.println("The language is English");
        }else if(str.equals("Pruvit") || str.equals("Zdorov")){
            System.out.println("The language is Ukrainian");
        }else if(str.equals("Salut") || str.equals("Ce Faci")){
            System.out.println("The language is Romanian");
        }else if(str.equals("Hola") || str.equals("Como Esta")){
            System.out.println("Language is Spanish");
        }else if(str.equals("Zdravo") || str.equals("Kaki Si")){
            System.out.println("Language is Serbian");
        }else{
            System.out.println("I'm sorry, I don't speak this language yet");
        }









    }
}
