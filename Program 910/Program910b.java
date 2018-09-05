
/**
 * Shai Caspin
 * 03/22/2017
 * Carrboro High School
 * Program 910b - Covering all bases
 * 
 * Description: This program converts user base-10 numbers to any other number based on the 
 *              base inputted by the user.
 * What I learned: I learned how to user recursive algorithms and convert bases.
 * Difficulties: While the program description does not specify it, when the base used in higher than 10,
 *               the numbers are converted into letters in the higher powers, which required me to create
 *               an array where letters extend the numbers.
 */

import java.util.*;
import java.io.*;

public class Program910b
{
    
    //String for comversion of number to actual digit/charatcer
    private static String[] stringNum = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    /**
     * Main method
     * Gets user input and calls method for conversion, prints result
     */
    public static void main(String[] args)
    {
        //USER INPUT
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number base 10 to convert: ");
        int numToConvert = input.nextInt();
        System.out.print("Enter the new base: ");
        int base = input.nextInt();
        
        //Get new number after conversion
        String newNum = baseCon(numToConvert, base);
        
        //Print results
        System.out.print("The number "+numToConvert+" [base 10] = "+ newNum+ " [base "+base+"]");
        
    }
    
    /**
     * Method for conversion
     */
    public static String baseCon(int number, int base)
    {
        //divisions for conversion algorithms
        int quotient = number / base;
        int remainder = number % base;

        if (quotient == 0) // base case
        {
            return stringNum[remainder];      
        }
        else
        {
            return baseCon(quotient, base) + stringNum[remainder];
        }        
        
    }
    
}

/**
 * Sample output
 * 
Enter the number base 10 to convert: 255
Enter the new base: 16
The number 255 [base 10] = FF [base 16]
 * 
 * 
 *
Enter the number base 10 to convert: 256
Enter the new base: 16
The number 256 [base 10] = 100 [base 16]
 * 
 * 
 * 
Enter the number base 10 to convert: 34
Enter the new base: 8
The number 34 [base 10] = 42 [base 8]
 * 
 * 
 * 
Enter the number base 10 to convert: 100
Enter the new base: 3
The number 100 [base 10] = 10201 [base 3]
 * 
 * 
 * 
Enter the number base 10 to convert: 1034
Enter the new base: 12
The number 1034 [base 10] = 722 [base 12]
 *
 *
 *
Enter the number base 10 to convert: 7
Enter the new base: 6
The number 7 [base 10] = 11 [base 6]
 * 
 *
 *
Enter the number base 10 to convert: 156
Enter the new base: 13
The number 156 [base 10] = C0 [base 13]
 *
 *
 *
Enter the number base 10 to convert: 1898732
Enter the new base: 19
The number 1898732 [base 10] = EAFC5 [base 19]
 *
 *
 *
Enter the number base 10 to convert: 90812345
Enter the new base: 25
The number 90812345 [base 10] = 97BOIK [base 25]
 *
 *
 *
Enter the number base 10 to convert: 76
Enter the new base: 20
The number 76 [base 10] = 3G [base 20]
 *
 *
 *
Enter the number base 10 to convert: 91
Enter the new base: 19
The number 91 [base 10] = 4F [base 19]
 *
 */