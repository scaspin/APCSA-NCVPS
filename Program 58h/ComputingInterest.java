

/**
 * Shai Caspin
 * 09/22/16
 * Carrboro High School (NCVPS)
 * AP Computer Science A
 * 
 * Description: This progrma calculates the interest and final balance of an interest account.
 * What I learned: I learned how to use Math.pow to calculate exponents.
 * Difficulties: I tried to make rounding easier but since input allows for a length intial amount with numbers
 *                  after the decimal point, I had to round it again.
 */

//allowing import
import java.io.* ;
import java.util.* ;

public class ComputingInterest
{
    public static void main(String[] args)
    {
        Scanner interestStats = new Scanner(System.in) ; //declating scanner
        
        System.out.print("Enter initial amount saved: ") ; //Player name
        double initialAmount = interestStats.nextDouble() ;
        
        System.out.print("Enter interest rate in precentage: ") ; //interest rate
        double interestRate = interestStats.nextDouble() ;
        
        System.out.print("Enter number of times per year interest will be compunded: ") ; //times compounded
        double compoundingTimes = interestStats.nextInt() ;
        
        System.out.print("Enter number of days the money will be kept in the savings account: "); //days in account
        int daysInAccount = interestStats.nextInt() ;
        
          // math equation for calculating interest A = P(1 + rt)
        double totalAmount = initialAmount * ( Math.pow(( 1.0 + (0.01 * interestRate / (double)compoundingTimes)), (compoundingTimes * daysInAccount / 365.0)) );
        
        double totalAmountRounded = (int)(totalAmount * 100 +0.05) /100.00 ; //round to second decimal place
        double interestAmount = totalAmountRounded - initialAmount ;
        double interestAmountRounded = (int)(interestAmount * 100 +0.05) /100.00 ;
        
        System.out.println("\nThe amount of interest earned is $" + interestAmountRounded + " \nto a total of $"
                            + totalAmountRounded + " after " + daysInAccount + " days in the account.");
        
    
    }
}
 /**
  * Sample output
Enter initial amount saved: 78684.8983
Enter interest rate in precentage: 21.45
Enter number of times per year interest will be compunded: 240
Enter number of days the money will be kept in the savings account: 500

The amount of interest earned is $26862.02 
to a total of $105546.92 after 500 days in the account.
  */