package day_19;

public class MultiplicationTable {
    public static void main(String[] args) {

        /**
         * Create a multiplication table starting with 1 and multiplying up to 10 using nested for loop
         * 1*1 = 1
         * 1*2 = 2
         * 1*3 = 3
         * ......
         * 1*10 = 10
         * 2*1 = 2
         *...
         *
         * 10*10 = 100
         *
         */


        for (int i = 1; i<=10; i++){

            for (int j = 1; j <=10; j++){
                System.out.println(i + "*" + j + " = " + i*j);
            }

            System.out.println("===========================");

        }


    }
}
