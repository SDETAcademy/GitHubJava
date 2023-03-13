package day_16;

public class CatOrCar {
    public static void main(String[] args) {

        /**
         * Given String str  = "car car horse chicken cat dog car cat dog parrot java cat"
         * use for loop
         * if the word is cat or car - print "The word is cat or car"
         */

        String str = "car car horse chicken cat dog car cat dog parrot java cat";

        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i, i+3).equalsIgnoreCase("car") || str.substring(i, i+3).equalsIgnoreCase("cat")){
                System.out.println("car and cat");
            }
        }

    }
}
