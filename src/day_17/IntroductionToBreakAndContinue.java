package day_17;

public class IntroductionToBreakAndContinue {
    public static void main(String[] args) {

        for (int i =0; i<20; i++) {

            if(i>=7 && i <=17 ){
                continue; // - java will ignore this iteration and carry on
            }
            System.out.println(i);
        }



        for (int i =0; i<20; i++) {

            if(i>=7 && i <=17 ){
                break; // - java will stop iteration and exit the loop
            }
            System.out.println(i);
        }



        for (int i =0; i<20; i++) {

            if(i>=7 && i <=17 ){
                return;// - java will stop iteration and will exit the method
            }
            System.out.println(i);
        }



    }
}
