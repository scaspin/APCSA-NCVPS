
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * AP Computer Science A
 * Program 58i - loan monthly payments
 * 
 * Description: This program calculates the payments on a loan based on given amounts, interest rates, and timeline of payments.
 * What I learned: I leanred that I have to use a lot of parantheses to make sure the math of a program executes correctly.
 * Difficultes: I didn't face any difficulties since this program was very similar to previous programs I wrote.
 */

//allow user input
import java.io.* ;
import java.util.* ;

public class MonthlyPayments
{
    public static void main(String[] args) 
    {
        Scanner loanStats = new Scanner(System.in) ; //allow scanner
        
        System.out.print("How much money is begin borrowed? ") ; // get total loan
        double loanAmount = loanStats.nextDouble() ;
        
        System.out.print("At what interest rate? "); // get interest rate
        double loanRate = loanStats.nextDouble() ;
        
        System.out.print("How many years to pay off loan? "); //years for loan, can be a decimal
        int loanMonths = loanStats.nextInt() * 12;
        
        double monthlyPayment ; // calculations
        monthlyPayment = loanAmount * ( loanRate / 1200 ) * Math.pow((1+(loanRate/1200)),loanMonths) / (Math.pow((1+(loanRate/1200)),loanMonths)-1) ;
        
        double totalPayment = monthlyPayment * loanMonths ; //added calculations
        double totalInterest = totalPayment - loanAmount ; //added calculations
        
        //rounding
        double monthlyPaymentRounded = (int)(monthlyPayment * 100 + 0.05) /100.00 ; 
        double totalPaymentRounded = (int)(totalPayment * 100 + 0.05) /100.00 ;
        double totalInterestRounded = (int)(totalInterest * 100 + 0.05) /100.00 ;
        
        //output of calculations
        System.out.println("\nThe monthly payment will be: $" + monthlyPaymentRounded) ;
        System.out.println("The total interest will be: $" + totalInterestRounded) ;
        System.out.println("Total amount paid will be: $" + totalPaymentRounded) ;
        
        
    }
}
/**
 * Sample output:
How much money is begin borrowed? 7500
At what interest rate? 14.5
How many years to pay off loan?3

The monthly payment will be: $258.15
The total interest will be: $1793.66
Total amount paid will be: $9293.66
------------------------------------
How much money is begin borrowed? 7500
At what interest rate? 14.5
How many years to pay off loan? 4

The monthly payment will be: $206.83
The total interest will be: $2428.06
Total amount paid will be: $9928.06
------------------------------------
How much money is begin borrowed? 7500
At what interest rate? 7.5
How many years to pay off loan? 3

The monthly payment will be: $233.29
The total interest will be: $898.67
Total amount paid will be: $8398.67
------------------------------------
How much money is begin borrowed? 5000
At what interest rate? 12
How many years to pay off loan? 5

The monthly payment will be: $111.22
The total interest will be: $1673.33
Total amount paid will be: $6673.33
------------------------------------
How much money is begin borrowed? 100000
At what interest rate? 30.2
How many years to pay off loan? 50

The monthly payment will be: $2516.66
The total interest will be: $1410000.5
Total amount paid will be: $1510000.5

 */