package day_27;

public class VarArgs {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        sumVarArgs(x, y);
        System.out.println(sumVarArgs(13, 45, 412, 44, 1, 214, 4, 4));
        sumVarArgs(x);



    }

    public static void sumVarArgs(int a, int b){
        int sum = 0;
        sum= a +b;
        System.out.println(sum);
    }
    public static void sumVarArgs(int a){
        int sum = 0;
        sum= a;
        System.out.println(sum);
    }


    public static int sumVarArgs(int ... nums){
        int sum = 0;
        for (int each: nums){
            sum += each;
        }
        return sum;
    }


}
