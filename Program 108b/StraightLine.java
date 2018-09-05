
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 10/04/16
 * Program 108b- Straight line method of depreciation
 * 
 * Description: This program runs four scenarios for the straight line method of depreciation.
 * What I learned: I learned how to use a for loop.
 * Difficulties: The instructures weren't very clear and I'm still not sure ifI did this right.
 *               I was trying to use a loop in the calculations themselves but couldn't figure out to what end.
 */

import java.io.*;
import java.util.*;

public class StraightLine
{
    public static void main(String[] args)
    {
        Scanner valueInput = new Scanner(System.in); //declare scanner class
        
        for( int run=1; run<5; run++) //set up loop to run program 4 times
        {
            System.out.println("Run #"+ run); //output what loop the program is on
            
            //get user input
            System.out.print("Enter original price: $");
            double initialPrice = valueInput.nextDouble();
            System.out.print("Enter salvage value: $");
            double salvagePrice = valueInput.nextDouble();
            System.out.print("Enter estimated life in years: ");
            double years = valueInput.nextDouble();
            
            //calculate depreciation
            double depreciation = (int)(((initialPrice - salvagePrice) / years)* 100 +0.5)/100.00;
            
            System.out.println("The annual depreciation is: $" + depreciation + "\n"); //output depreciation
        }
    }
}
/**
 * Sample output
Run #1
Enter original price: $250
Enter salvage value: $35
Enter estimated life in years: 8
The annual depreciation is: $26.88

Run #2
Enter original price: $2425
Enter salvage value: $470
Enter estimated life in years: 6
The annual depreciation is: $325.83

Run #3
Enter original price: $1162
Enter salvage value: $625
Enter estimated life in years: 5
The annual depreciation is: $107.4

Run #4
Enter original price: $9654.33
Enter salvage value: $100
Enter estimated life in years: 12
The annual depreciation is: $796.19
 */