
/**
 * Shai Caspin
 * 02/23/17
 * Carrbro HS (NCVPS)
 * Program 411a-Factors, Factors, Factors
 * 
 * Description: This program factors integers in a loop until the user does not want to factor anymore.
 *              It omits the number 1 and the number itself as integers, and ranks them in order.
 * What I learned: How to find factors.             
 */

import java.io.*;
import java.util.*;

public class Factor
{
    public static void main(String[] args)
    {
        //Set up scanner for all calculations
        Scanner input = new Scanner(System.in);
        
        //set up loop for program to run as long as number is greater than 1 (quits as 0)
        int num = 1;
        while (num>0)
        {
            //Get user input for number to factor
            System.out.print("\nEnter a number to factor (zero to quit): ");
            num = input.nextInt();
            
            //Quit program if number is one
            if (num==0)
            {
                System.exit(0);
            }
            
            //Find and print factors of the inputted number
            System.out.print("Factors: ");
            for (int i = 2; i<= (num/2) ; i++)
                {
               if(num%i==0){
                    System.out.print(i + "\t");
                }
            }
        }
    }
}
/**
 * Sample output
 * 
Enter a number to factor (zero to quit): 45
Factors: 3	5	9	15	
Enter a number to factor (zero to quit): 9008
Factors: 2	4	8	16	563	1126	2252	4504	
Enter a number to factor (zero to quit): 900
Factors: 2	3	4	5	6	9	10	12	15	18	20	25	30	36	45	50	60	75	90	100	150	180	225	300	450	
Enter a number to factor (zero to quit): 98765
Factors: 5	19753	
Enter a number to factor (zero to quit): 13452
Factors: 2	3	4	6	12	19	38	57	59	76	114	118	177	228	236	354	708	1121	2242	3363	4484	6726	
Enter a number to factor (zero to quit): 12
Factors: 2	3	4	6	
Enter a number to factor (zero to quit): 100
Factors: 2	4	5	10	20	25	50	
Enter a number to factor (zero to quit): 876
Factors: 2	3	4	6	12	73	146	219	292	438	
Enter a number to factor (zero to quit): 0
 * 
 */