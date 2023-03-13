package day_19;

public class CountDuplicatesForLoop {
    public static void main(String[] args) {

        /**
         * Create a program that will have String str = "java"
         * The program should iterate through each charter and should print how many times this character is being duplicated
         * Example:
         j has no duplicates - 1
         a has duplicates - 2
         v has no duplicates - 1
         a has duplicates - 2
         */

        String str = "java";
        //

        int count = 0;

        for (int i = 0; i<str.length(); i++){
            for (int j = 0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                System.out.println(str.charAt(i) + " has duplicates - " + count);
            }else{
                System.out.println(str.charAt(i) + " has no duplicates - " + count);
            }
            count=0;
        }

    }
}
