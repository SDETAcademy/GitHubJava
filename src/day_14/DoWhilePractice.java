package day_14;

public class DoWhilePractice {
    public static void main(String[] args) {

    String str = "Hello";
    int count = 0;

    do {
        if(str.isEmpty()){
            System.out.println("str is empty");
        }else{
            if (count!=str.length()){
                count++;
            }
        }
    }while (count<str.length());

        System.out.println(count);


    }
}
