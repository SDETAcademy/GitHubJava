package day_14;

public class DoWhileCountHi {
    public static void main(String[] args) {

        /**
         * Create a program that will have str "hi Cornelia, hi Julian, hi Mu, hi Tatiana, hi Roman, hi Maria, hi"
         * Please count how many "hi" are in the str, using while loop
         */


        String str = "hi Cornelia, hi Julian, hi Mu, hi Tatiana, hi Roman, hi Maria, hi";//

        int index;
        int count = 0;
        do {
            if(str.isBlank() || str.isEmpty()){
                System.out.println("Error message");
            }else{
                index = str.indexOf("hi"); //-1
                str=str.substring(index+2);
                count++;
            }
        }while (str.contains("hi"));

        if(count!=0){
            System.out.println(count);
        }
    }
}
