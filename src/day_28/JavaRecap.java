package day_28;

public class JavaRecap {
    public static void main(String[] args) {

        System.out.println(randomMethod());
        System.out.println(randomMethod(5));

        int a = 10;
        Integer b = a; //10
        int c = b;
        System.out.println(a == b);

        /**
         * Arrays advantages:
         * - stores many values
         * - very memory efficient
         * - allows you to store duplicates [1,1,1,1,1,1,1,1]
         * - preserves the order of insertion = {5,6,7} - [5,6,7]
         * - does not change the length
         */

        String str = "Java"; // literal
        String str2 = new String("Java");//String is immutable, and anytime we change anything,
                                                // Java creates a brand new String for us

        StringBuilder builder = new StringBuilder(str);

        System.out.println(str);
        System.out.println(str2);
        str +=" is ";
        str += " fun";
        System.out.println(str);

        StringBuilder str3 = new StringBuilder("Java");//mutable. builder is not thread safe and faster
        StringBuffer str4 = new StringBuffer("Java"); //mutable. buffer is thread safe and slower
        str3.append("javajava");
        System.out.println(str3);
        System.out.println(str3.reverse());
        String s = str3.toString();


        //recursion

        printSomething(5);

    }

    public static String randomMethod(String str){
        str = str.repeat(4);
        return str;
    }

    public static int randomMethod(int str){
        return str;
    }
    public static String randomMethod(String ... str){
        String result = "";
        for (String each : str) {
            result+=each;
        }
        return result;
    }

    public static void printSomething(int num){

        if(num<=30){
            System.out.println(num++);
            printSomething(num);
        }

    }

}
