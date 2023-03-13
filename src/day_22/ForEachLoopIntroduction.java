package day_22;

public class ForEachLoopIntroduction {
    public static void main(String[] args) {


        /**
         *  - while loop - when we don't know the number of iterations,
         *  when we only need to iterate forward and we don't care about the indexes
         *  - do while loop - do while loop will run at least 1 time before it will even check the condition,
         * when we don't know the number of iterations and we don't care about the direction either
         *  - for loop - has iterator, we can choose which direction to iterate, we can choose how many times to iterate
         * - for each - looks very clean, but we cannot choose the direction of iteration, we cannot specify the index of elements
         * - we cannot control how many times we will iterate
         */

        String[] strArr = {"Cornelia", "Tatiana", "Maria", "Julian", "Mu"};


        for(String minute : strArr){
            System.out.println(minute.replace("a", ""));
        }

    }
}
