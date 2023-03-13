package day_27;

public class StringVsBuilderVsBuffer {
    public static void main(String[] args) {
        String str = "Java is fun";// uses char[] on the background
        String str2 = "Java is fun"; // String is immutable
        System.out.println(str2==str);

        StringBuilder str3 = new StringBuilder("Java is fun ");//mutable
        StringBuffer str4 = new StringBuffer("Java is fun");// mutable

        System.out.println(str3.reverse());
        System.out.println(str4.reverse());




    }
}
