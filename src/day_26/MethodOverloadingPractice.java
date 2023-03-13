package day_26;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

        int numOne = 20;
        int numTwo = 50;
        String number = "10"; // "10" - 10


        int numThree = 20;
        double numFour = 10.4;
        double numFive = 11.4;
        System.out.println(multiplicationMethod(numThree, numTwo, numOne));
        System.out.println(multiplicationMethod(numThree, numTwo));
        System.out.println(multiplicationMethod("10", 20, 24));

    }


    public static int multiplicationMethod(int a, int b){
        return a*b;
    }

    public static int multiplicationMethod(int a, int b, int c){
        return a*b*c;
    }

    public static double multiplicationMethod(double a, double b){
        return a*b;
    }
    public static double multiplicationMethod(double a, double b, String str){

        return a*b*Integer.parseInt(str);
    }

    public static double multiplicationMethod(String str, double a, double b){
        return a*b*Integer.parseInt(str);
    }
}
