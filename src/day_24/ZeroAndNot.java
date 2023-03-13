package day_24;


import java.util.Arrays;

public class ZeroAndNot {
    public static void main(String[] args) {
        int[] num = {1,2,5,4,8,9,10,5,6,4,6,87,9,8,7};
        int temp;

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){

                if(num[i]%2==0){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;

                }
            }

        }
        System.out.println(Arrays.toString(num));
    }
}