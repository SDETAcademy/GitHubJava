package day_18;

public class Palindrome {
    public static void main(String[] args) {

        /**
         * Please create a program that will verify if the String str is Palindrome or not
         * (Examples: civic, kayak, level, radar, mom, dad, maam, noon, racecar, deified, repaper).
         */


        String str = "Bird rib";
        //            01234
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == ' ' || str.charAt(str.length()-1-i) == ' ') {
                continue;
            } else if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);


    }
}
