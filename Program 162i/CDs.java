
/**
 * Shai Caspin
 * 10/14/16
 * Carrboro High School (NCVPS)
 * Program 162i- CDs that don't play music extra credit
 * 
 * Description: This program calculates Certificate of Deposit interest for a 5 year deposit. The user enters
 *              the initial investment and then the interest rate for each year, and sees how much interest 
 *              is earned that year. The final output is the final value of the CD after the 5 years.
 * What I learned: I leanred how to implement for loops more efficently.
 * Difficulties: I had to work a lot to find the least amount of variables that will produce the simplest program.
 * 
 */

//allow user input
import java.io.*;
import java.util.* ;

public class CDs
{ 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //establish scanner class
        System.out.print("Enter initial investment: $"); //ask for investment
        double investment= input.nextDouble(); //declare initial investment
               
        for (int year = 1 ; year<=5 ; year++) //loop for 5 years starting with year 1, compunded once a year
        {
            System.out.print("Enter rate for year "+ year+" :"); //get user input for rate in each year
            double rate = input.nextDouble();//assign variable rate
            
            double interest = (int)((rate/100) * investment *100 + 0.5)/100.00; //calculate and round interest
            System.out.print("You earned $" + interest + " in interest.\n\n"); //display ONLY interest
            
            investment += interest; //add interest to the intial investment
        }
        
        System.out.print("Your CD is now worth: $" + investment); //display final value of CD
       }
}
/**
 * Sample output
 * 
Enter initial investment: $3000
Enter rate for year 1 :10
You earned $300.0 in interest.

Enter rate for year 2 :5.0
You earned $165.0 in interest.

Enter rate for year 3 :7
You earned $242.55 in interest.

Enter rate for year 4 :9
You earned $333.68 in interest.

Enter rate for year 5 :11
You earned $444.54 in interest.

Your CD is now worth: $4485.77
 * 
 * 
 * 
Enter initial investment: $28991
Enter rate for year 1 :.9
You earned $260.92 in interest.

Enter rate for year 2 :10
You earned $2925.19 in interest.

Enter rate for year 3 :4.5
You earned $1447.97 in interest.

Enter rate for year 4 :90
You earned $30262.57 in interest.

Enter rate for year 5 :8
You earned $5111.01 in interest.

Your CD is now worth: $68998.66
 *
 *
 *
Enter initial investment: $76
Enter rate for year 1 :5
You earned $3.8 in interest.

Enter rate for year 2 :6
You earned $4.79 in interest.

Enter rate for year 3 :7
You earned $5.92 in interest.

Enter rate for year 4 :8
You earned $7.24 in interest.

Enter rate for year 5 :9
You earned $8.8 in interest.

Your CD is now worth: $106.55
 *
 *
 *
Enter initial investment: $9012
Enter rate for year 1 :.3
You earned $27.04 in interest.

Enter rate for year 2 :9
You earned $813.51 in interest.

Enter rate for year 3 :7.89
You earned $777.37 in interest.

Enter rate for year 4 :23
You earned $2444.88 in interest.

Enter rate for year 5 :4
You earned $522.99 in interest.

Your CD is now worth: $13597.79
 *
 *
 *
Enter initial investment: $5
Enter rate for year 1 :100
You earned $5.0 in interest.

Enter rate for year 2 :99
You earned $9.9 in interest.

Enter rate for year 3 :88
You earned $17.51 in interest.

Enter rate for year 4 :77
You earned $28.81 in interest.

Enter rate for year 5 :66
You earned $43.71 in interest.

Your CD is now worth: $109.93
 *
 *
 *
Enter initial investment: $234
Enter rate for year 1 :12
You earned $28.08 in interest.

Enter rate for year 2 :23
You earned $60.28 in interest.

Enter rate for year 3 :45
You earned $145.06 in interest.

Enter rate for year 4 :67
You earned $313.17 in interest.

Enter rate for year 5 :89
You earned $694.73 in interest.

Your CD is now worth: $1475.32
 */