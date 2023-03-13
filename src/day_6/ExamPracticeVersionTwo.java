package day_6;

public class ExamPracticeVersionTwo {
    public static void main(String[] args) {

        /*
        
        1. int a = 10; - we never used it in the code(dead code); 
        2. boundary testing
  
        
        != 0
        != 10
        
         */
//        
//        boolean isAllowed = false;
//        
//        if(isAllowed){
//            System.out.println("Something");
//        }
        
        
        /*
              
        Variables:
        - attendance - double;
        - score - byte;
        - grade - char;
         */


        /**
         * please the if condition to determine the result of the exam:
         * if  the score is 90-100 - please print the message 'A+'(use char)
         * if the score is 80-90 - please print 'A'
         * if the score is 70-80 - please print 'B'
         * if the score is 60-70 - please print 'C'
         * if the score is <60 - print Failed the exam
         * default: think about the boundaries, score: 0-100;
         *
         * Add a boolean condition - create a boolean variable called attendance, and if
         * attendance is <80 then the student can not take the exam, otherwise allow the student to participate in the exam.
         */

        double attendance = 85;
        //80-100;
        byte score = 91;
        char grade;

        if (attendance >= 0 && attendance < 80) {
            System.out.println("I'm sorry, you are not allowed to take the exam");
        }
        else if (attendance < 0 || attendance > 100) {
            System.out.println("Your attendance input is incorrect, please try again");
        }
        else if (score < 0 || score > 100) {
            System.out.println("Your score input is incorrect, please try again");
        }
        else if (score >= 0 && score < 60) {
            System.out.println("You have failed miserably. I feel sorry for you!!");
        } else if (score >= 60 && score < 70) {
            grade = 'C';
            System.out.println("Your score is " + grade + " . You have passed");
        }else if(score>=70 && score < 80){
            grade = 'B';
            System.out.println("Your score is " + grade + " . You have passed");
        }else if(score>=80 && score <90){
            grade = 'A';
            System.out.println("Your score is " + grade + " . You have passed");
        }else if (score >=90){
            grade = 'A';
            System.out.println("Your score is " + grade + "+" + " . You have passed");
        }

    }
}
