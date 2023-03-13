package day_27;

public class RecursionIntro {
    public static void main(String[] args) {

        //recursion or reoccurrence

        int a = 90;
        numberPrint(a);


    }

    public static void numberPrint(int num){ // recursion is only happening when the method calls itself

        if(num<=100){
            System.out.print(num++ + " ");
            numberPrint(num);
        }

    }

}
