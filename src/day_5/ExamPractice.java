package day_5;

public class ExamPractice {
    public static void main(String[] args) {

        /**
         * please the if condition to determine the result of the exam:
         * if  the score is 90-100 - please print the message 'A+'(use char)
         * if the score is 80-90 - please print 'A'
         * if the score is 70-80 - please print 'B'
         * if the score is 60-70 - please print 'C'
         * if the score is <60 - print Failed the exam
         *
         * Add a boolean condition - create a boolean variable called attendance, and if
         * attendance is <80 then the student can not take the exam, otherwise allow the student to participate in the exam.
         */

        double score = -13;
        char grade;
        int attendancePercentage = 89;
        boolean isAllowedToExam;

        if(attendancePercentage<80){
            isAllowedToExam = false;
            System.out.println("Your attendance is " + isAllowedToExam + " , therefore please talk to your principal");
        }else if(score < 60 && score >=0){
            System.out.println("You have failed the exam");
        }else if(score >=60 && score < 70){
            grade = 'C';
            System.out.println("Your grade is " + grade);
        }else if(score >=70 && score < 80){
            grade = 'B';
            System.out.println("Your grade is " + grade);
        }else if(score>=80 && score < 90){
            grade = 'A';
            System.out.println("Your grade is " + grade);
        }else if(score>=90 && score <=100){
            grade = 'A';
            System.out.println("Your grade is " + grade + "+");
        }else{
            System.out.println("Your have entered invalid score");
        }
    }

}
