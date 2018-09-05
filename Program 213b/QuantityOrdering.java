
/**
 * Shai Caspin
 * 11/14/16
 * Carrboro HS (NCVPS)
 * Program 213b - Quantity Ordering
 * 
 * Description: This program calculates the amount due for an order of a set number of items if the price
 *              of a single item changes based on the quantity ordered.
 * What I learned: I learned how to use decision making statements.
 * Difficulties: I didn't have any difficulties:
 * 
 */

import java.util.*;
import java.io.*;

public class QuantityOrdering
{
   public static void main(String[] agrs)
   {
       //GET USER INPUT
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter quantity: ");
       int quantity= input.nextInt();
       
       //DECLARE VARAIBLES
       double pricePerQuan=0;
       
       //DETERMINE WHAT THE PRICE IS PER ONE QUANTITY
       if (quantity<200)
       {
           if (quantity<=99)
              pricePerQuan = 7.95;
           else   
              pricePerQuan = 7.75;
        }
       else
       {
           if (quantity<=299)
              pricePerQuan = 7.40;
           else   
              pricePerQuan = 7.15;
        }
       
       //CALCULATES THE ACTUAL AMOUNT DUE
       double amountDue = quantity * pricePerQuan;
       
       //DISPKAY OUTPUT
       System.out.println("The price of one item is $" + pricePerQuan);
       System.out.println("The amount due of the order is $" + amountDue);
        
    }
}
/**
 * Sample output
 * 
Enter quantity: 50
The price of one item is $7.95
The amount due of the order is $397.5
 * 
 * 
 * 
Enter quantity: 199
The price of one item is $7.75
The amount due of the order is $1542.25
 * 
 * 
 * 
Enter quantity: 200
The price of one item is $7.4
The amount due of the order is $1480.0
 * 
 * 
 * 
Enter quantity: 475
The price of one item is $7.15
The amount due of the order is $3396.25 
 * 
 * 
 * 
Enter quantity: 1
The price of one item is $7.95
The amount due of the order is $7.95
 * 
 * 
 * 
Enter quantity: 300
The price of one item is $7.15
The amount due of the order is $2145.0
 *
 *
 *
Enter quantity: 0
The price of one item is $7.95
The amount due of the order is $0.0
 *
 *
 *
Enter quantity: 156
The price of one item is $7.75
The amount due of the order is $1209.0
 *
 *
 *
Enter quantity: 300
The price of one item is $7.15
The amount due of the order is $2145.0
 */