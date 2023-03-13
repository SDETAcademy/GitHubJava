package day_25;

import java.util.Random;

public class CalculatorCustomMethod {
    public static void main(String[] args) {

        Random random =new Random();
        int a = random.nextInt();
        System.out.println(a);
        int b = random.nextInt();
        System.out.println(b);
        char action = '+';
        mathOperation(a,b,action);



    }
    public static int mathOperation( int x, int y, char action) {
        if (action=='+'){
        }else if(action == x+y){
            return x+y;
        }else if (action==x-y){
            return x-y;
        }else if (action==x*y){
            return x+y;
        }else if (action==x/y){
            return x/y;
        }else if (action==x%y){
            return x%y;

        }

        return action;
    }
}



