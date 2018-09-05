/**
 * Shai Caspin
 * 10/07/16
 * Carrboro High School (NCVPS)
 * Program 122q- Compound That extra credit program
 * 
 * Descripion: This program produces different values of loans with the same initial amount and interest rate but 
 *             compounded at different intervals. Once a year, once a month, and once a day for a certain number of years until the .
 * What I learned: I learned how to use the Easy.Format class in formatting output and to reuse variables in different loops.
 * Difficulties: I had a little trouble figuring out what the instructions meant, but otherwise I liked it!
 */

import java.io.*;
import java.util.*;

public class CompoundThat
{
   public static void main(String[] args)
   {
       Scanner stats = new Scanner(System.in);
       
       //Get user input
       System.out.print("Enter account balance: $");
       double balanceInitial = stats.nextDouble();
       System.out.print("Enter interest rate (as a decimal): ");
       double rate = stats.nextDouble();
       
       System.out.println("\nCompounding      Years to double         Ending balance ($)");
       
       //Compounded once a year
       double balanceYear= balanceInitial;
       int year;
       for (year= 1; balanceYear <= (2 * balanceInitial);year++) //set loop to run until balance is doubel initial
       { 
           balanceYear = balanceYear+ (balanceYear * rate); //calculate compounding once a year
        }
       
       //Print results of loop so variables can be reused with no loss
       System.out.println("Once a year   " + EasyFormat.format(year,12,2) +EasyFormat.format(balanceYear,30,4));
      
       
       //Compounded once a month
       double balanceMonth= balanceInitial;
       int month;
       for (month= 1; balanceMonth <= (2 * balanceInitial);month++)//set loop to run until balance is doubel initial
       { 
           balanceMonth = balanceMonth + (balanceMonth * (rate/12)); //calculate compounding once a month
        }
       
        //Print results of loop so variables can be reused with no loss
        System.out.println("Once a month   " + EasyFormat.format((month/12.0),11,2) +EasyFormat.format(balanceMonth,30,4));
       
       //Compounded once a day
       double balanceDay= balanceInitial;
       int day;
       for (day= 1; balanceDay <= (2 * balanceInitial);day++)//set loop to run until balance is doubel initial
       { 
           balanceDay = balanceDay + (balanceDay * (rate/265)); //calculate compounding once a day
        }
       
       //Print results of loop so variables can be reused with no loss
       System.out.println("Once a day     " + EasyFormat.format((day/365.0),11,2) +EasyFormat.format(balanceDay,30,4));
    
   }
}

/**
 * Sample output
 *
Enter account balance: $407.657
Enter interest rate (as a decimal): .035

Compounding      Years to double         Ending balance ($)
Once a year          22.00                      839.5417
Once a month         19.92                      815.3214
Once a day           14.38                      815.3720
 *
 *
Enter account balance: $567439
Enter interest rate (as a decimal): .01

Compounding      Years to double         Ending balance ($)
Once a year          71.00                  1138715.7990
Once a month         69.50                  1135707.2297
Once a day           50.33                  1134888.8409
 *
 *
Enter account balance: $789.2
Enter interest rate (as a decimal): .0009

Compounding      Years to double         Ending balance ($)
Once a year         772.00                     1579.0958
Once a month        770.33                     1578.4818
Once a day          559.16                     1578.4017
 **/
