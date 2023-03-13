package day_24;

import java.util.Arrays;

public class SortABooleanArray {
    public static void main(String[] args) {
        boolean [] boo ={false,true,true,false,false,false,true};
        boolean temp;
        for (int i=0; i< boo.length; i++){
            for(int j = 0; j< boo.length; j++){
                if(boo[i]){
                    temp = boo[i];
                    boo[i] =boo[j];
                    boo[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(boo));

    }
}
