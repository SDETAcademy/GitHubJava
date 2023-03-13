package day_25;

public class IsPalindromeCustomMethod {
    public static void main(String[] args) {

        String str = "Tatsiana"; // Civic, "", Civ ic
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        boolean isPalindrome = false;
        if (str.isEmpty()) {
            isPalindrome = false;

        } else {
            str.toLowerCase().replace(" ", "");
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                    isPalindrome = true;
                }
            }

        }
        return isPalindrome;
    }

}
