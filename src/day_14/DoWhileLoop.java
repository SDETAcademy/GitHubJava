package day_14;

public class DoWhileLoop {
    public static void main(String[] args) {

//        while(condition){
//        code
//        }


        int apples = 10;
        int count = 0;

        while(apples>=0){
            System.out.println("I'm eating apples #" + apples);
            apples--;
            count++;
        }

//---------------------------------------------------------------
        do {
            System.out.println("I'm eating apples #" + apples);
            apples--;
            count++;
        }
        while(apples>=0);


        System.out.println("I have eaten " + count + " apples");







    }
}
