package day_16;

public class RemoveDuplicates {
    public static void main(String[] args) {

        /**
         * Given String str = "JavavavavavIssssGreate". Result = JavIsGret
         * Create a program that will have String result variable and will only have unique characters
         * Use For Loop
         */

         String str = "JavavavavavIssssGreate";

         String result = "";

         for (int i = 0; i<str.length(); i++){
             if(!result.contains("" + str.charAt(i))){
                 result += str.charAt(i);
             }
         }

        System.out.println(result);

    }
}
