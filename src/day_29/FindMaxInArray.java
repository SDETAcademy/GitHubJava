package day_29;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] num = {1,2,2,3,3,3,5,6,7, 2, 2, 2, 2};
        int count = 0;
        int max = 0;
        int number = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if(num[i] == num[j]){
                    count++;
                    if(count > max){
                        number = num[i];
                        max = count;
                    }
                }
            }
            count = 0;
        }
        System.out.println("number-" + number + " count-" + max);

    }
}
