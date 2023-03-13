package day_11;

public class MiddleCharacterTask {
    public static void main(String[] args){

        /**
         * Write a program that will print out the middle character if length of the word is odd,
         * but if the length of the word is even - print "There is no middle character in this word"
         * - make sure your code is dynamic and works with different words(also please check if the word is not empty)
         */
        char character;

        String str = "MaximmmIsTheBests"; // 8%2 = 0 - even - there is no middle character
        String strTwo = "Nicholas"; //5%2 = 1 - odd - the middle character is 'x';
        //               01234
        // 5/2 = 2.5 - since we are using int the result is going to be 2

        if(str.isEmpty()){
            System.out.println("The str" + " is empty");
        }else{
            if(str.length()%2==0){
                System.out.println("The number of character is even, so there is no middle character");
            }else if(str.length()%2==1){
                int index = str.length()/2; // == 2
                //dynamic vs hard coded
                character = str.charAt(index);
                // charAt(index) - getting the character
                System.out.println("The middle character is " + character);
            }
        }






    }
}
