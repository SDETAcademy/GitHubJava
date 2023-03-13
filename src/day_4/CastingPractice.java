package day_4;

public class CastingPractice {
    public static void main(String[] args) {

//        int variableOne = 10;
//        double variableTwo = variableOne;
//
//        System.out.println(variableOne);
//        System.out.println(variableTwo);
//
//        byte a = 15;
//        long b = a;
//
//        System.out.println(a);
//        System.out.println(b);


//        double variableOne = 10.99999;
//        int variableTwo = (int)variableOne;
//
//        System.out.println(variableOne);
//        System.out.println(variableTwo);
//
//        float a = 113.99999f;
//        byte b = (byte) a;
//
//        System.out.println(a);
//        System.out.println(b);
//
//
//        String number;
//
//        System.out.println(number= String.valueOf(b));


        /**
         *
         * 1.Create a byte, short and int variables and cast them into the double;
         * 2. Create double, long, float variables and cast it into an int;
         */

        byte varOne = 15;
        short varTwo = 20;
        int varThree = 35;

        double varOneOne = varOne;
        double varTwoTwo = varTwo;
        double varThreeThee = varThree;
        System.out.println(varOneOne);
        System.out.println(varTwoTwo);
        System.out.println(varThreeThee);

        double w1 = 2.3456;
        long w2 = 34567893L;
        float w3 = 34.54F;
        int i1 = (int)w1;
        System.out.println(i1);
        int i2 = (int) w2;
        System.out.println(i2);
        int i3 = (int) w3;
        System.out.println(i3);






    }
}
