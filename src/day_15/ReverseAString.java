package day_15;

public class ReverseAString {
    public static void main(String[] args) {
/**
 * Create a program that will reverse the String in all CAPITAL case
 */

        String str = "Java";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.toUpperCase().charAt(i);
        }
        System.out.println(reverse);
    }
}
