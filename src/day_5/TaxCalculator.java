package day_5;

public class TaxCalculator {
    public static void main(String[] args){

        String employeeName = "Nicolas Cage";
        double employeeHourlyRate = 35.00;
        double annualSalary = employeeHourlyRate*40*52;
        double taxBracket = 0;
        double finalTaxBracket = 0;
        boolean isMarried = false;
        double discount = 0;


        /**
         *
         * if an employee makes <100,000/year = tax bracket is 30% - Please print his net income
         * if an employee makes 100,000-250,000 = tax bracket is 35%  - Please print his net income
         * if an employee makes 250,000-400,000 = tax bracket is 40% - Please print his net income
         * if an employee makes >400,000 = his bracket is 47% - please print his net income
         * if the employee is married - give him a 5% discount on his tax bracket
         */

        /*

        && - AND
        || - OR
         */
        if(isMarried = true){
             discount = 5;
        }
        if(annualSalary<100000){
            taxBracket = 30;
        }else if (annualSalary >= 100000 && annualSalary < 250000 ){
            taxBracket = 35;
        }else if(annualSalary >= 250000 && annualSalary <= 400000){
            taxBracket = 40;
        }else if(annualSalary >= 400000){
            taxBracket = 47;
        }




        finalTaxBracket = 100-taxBracket + discount;
        double netIncome = annualSalary/100*finalTaxBracket;


        System.out.println("Your net income is " + netIncome);








    }


}
