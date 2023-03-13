package day_25;

public class StringChacarter {
    public static void main(String[] args) {

        String str = "Maria"; //Worldd

       char myCharacter = returnLastCharacter(str);

       String result = str + myCharacter;
        System.out.println(result);
    }

    public static char returnLastCharacter(String str){
        return str.charAt(str.length()-1);
    }


}
