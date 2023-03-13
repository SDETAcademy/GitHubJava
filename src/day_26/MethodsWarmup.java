package day_26;

public class MethodsWarmup {
    public static void main(String[] args) {

        /**
         * Create a custom method, hasDuplicates that will return true if the String[] has at least 1 duplicated letter
         * otherwise return false ["r", "a", "a", "b", "c", "d", "a"]
         */

        String[] arr = {};
        System.out.println(hasDuplicates(arr));

    }

    public static boolean hasDuplicates(String[] arrStr){
        int count = 0;
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                if(arrStr[i]==arrStr[j]){
                    count++;
                }
            }
            if(count>1){
                return true;
            }else{
                count=0;
            }
        }
        return false;
    }

}
