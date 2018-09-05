
/**
 * Shai Caspin
 * 10/18/16
 * Carrboro High School (NCVPS)
 * Program 166d - Minimum Wage
 * 
 * Description: An employer wants to see a breakdown of employee costs for 3, 4, 5, 6 and 7 employees 
 *              who make any amount of dollars per hour. The employer wants to see their total wages if 
 *              they work 10, 20, 30, or 40 hours week.
 * What I learned: I learned how to use interated loops and calculations.
 * Difficulties: I wasn't sure if I was supposed to get user input on the hourly rate or not, 
 *               but other than that the program wasn't very difficult.
 * 
 */

//Allow for user input
import java.io.*;
import java.util.*;

public class MinimumWage
{
   public static void main(String[] args)
   {
       //Get user input regarding wage
       Scanner rateInput = new Scanner(System.in); 
       System.out.print("Enter hourly rate: ");
       double hourlyRate = rateInput.nextDouble();
       
       for (int numEmployees=3; numEmployees<=7 ; numEmployees++) //looping for number of employees
       {
           System.out.println("\nWages for " +numEmployees+ " employees:\n"); //line regarding how many employees
           
           for (int hours = 10; hours<=40; hours+=10)//looping for hours of calculated wage
           {
               double wages = hourlyRate * numEmployees * hours ; //calculate actual final wages
               System.out.println("For " + hours+ " hours worked, the wages are $" +wages+ ".");  //dsiplay results
            }
        }
    }
}
/**
 * Sample output
 * 
Enter hourly rate: 8

Wages for 3 employees:

For 10 hours worked, the wages are $240.0.
For 20 hours worked, the wages are $480.0.
For 30 hours worked, the wages are $720.0.
For 40 hours worked, the wages are $960.0.

Wages for 4 employees:

For 10 hours worked, the wages are $320.0.
For 20 hours worked, the wages are $640.0.
For 30 hours worked, the wages are $960.0.
For 40 hours worked, the wages are $1280.0.

Wages for 5 employees:

For 10 hours worked, the wages are $400.0.
For 20 hours worked, the wages are $800.0.
For 30 hours worked, the wages are $1200.0.
For 40 hours worked, the wages are $1600.0.

Wages for 6 employees:

For 10 hours worked, the wages are $480.0.
For 20 hours worked, the wages are $960.0.
For 30 hours worked, the wages are $1440.0.
For 40 hours worked, the wages are $1920.0.

Wages for 7 employees:

For 10 hours worked, the wages are $560.0.
For 20 hours worked, the wages are $1120.0.
For 30 hours worked, the wages are $1680.0.
For 40 hours worked, the wages are $2240.0.
 * 
 * 
 * 
Enter hourly rate: 7.5

Wages for 3 employees:

For 10 hours worked, the wages are $225.0.
For 20 hours worked, the wages are $450.0.
For 30 hours worked, the wages are $675.0.
For 40 hours worked, the wages are $900.0.

Wages for 4 employees:

For 10 hours worked, the wages are $300.0.
For 20 hours worked, the wages are $600.0.
For 30 hours worked, the wages are $900.0.
For 40 hours worked, the wages are $1200.0.

Wages for 5 employees:

For 10 hours worked, the wages are $375.0.
For 20 hours worked, the wages are $750.0.
For 30 hours worked, the wages are $1125.0.
For 40 hours worked, the wages are $1500.0.

Wages for 6 employees:

For 10 hours worked, the wages are $450.0.
For 20 hours worked, the wages are $900.0.
For 30 hours worked, the wages are $1350.0.
For 40 hours worked, the wages are $1800.0.

Wages for 7 employees:

For 10 hours worked, the wages are $525.0.
For 20 hours worked, the wages are $1050.0.
For 30 hours worked, the wages are $1575.0.
For 40 hours worked, the wages are $2100.0.

 * 
 * 
 * 
Enter hourly rate: 4

Wages for 3 employees:

For 10 hours worked, the wages are $120.0.
For 20 hours worked, the wages are $240.0.
For 30 hours worked, the wages are $360.0.
For 40 hours worked, the wages are $480.0.

Wages for 4 employees:

For 10 hours worked, the wages are $160.0.
For 20 hours worked, the wages are $320.0.
For 30 hours worked, the wages are $480.0.
For 40 hours worked, the wages are $640.0.

Wages for 5 employees:

For 10 hours worked, the wages are $200.0.
For 20 hours worked, the wages are $400.0.
For 30 hours worked, the wages are $600.0.
For 40 hours worked, the wages are $800.0.

Wages for 6 employees:

For 10 hours worked, the wages are $240.0.
For 20 hours worked, the wages are $480.0.
For 30 hours worked, the wages are $720.0.
For 40 hours worked, the wages are $960.0.

Wages for 7 employees:

For 10 hours worked, the wages are $280.0.
For 20 hours worked, the wages are $560.0.
For 30 hours worked, the wages are $840.0.
For 40 hours worked, the wages are $1120.0.
 * 
 */