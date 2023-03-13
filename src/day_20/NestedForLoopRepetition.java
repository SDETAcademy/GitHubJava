package day_20;

public class NestedForLoopRepetition {
    public static void main(String[] args) {


        /**
         Create String str = java; We will need to count the frequency of each character but
         in out result we don't want a repetition of the characters
         */



        String str = "java";
        String result = "";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>1 && !result.contains("" + str.charAt(i))){
                result += str.charAt(i) + " - " + count + "\n";
            }else if(count==1 && !result.contains("" + str.charAt(i))){
                result += str.charAt(i) + " - " + count + "\n";
            }
            count=0;
        }
        System.out.println(result);
    }
}

