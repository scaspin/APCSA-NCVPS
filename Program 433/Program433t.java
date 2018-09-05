
/**
 * Shai Caspin
 * 03/01/2017
 * Carrboro High School (NCVPs)
 * Program 433t-num to words
 * 
 * Description: Convert doubles to integers 
 */

import java.util.*;
import java.io.*;

public class Program433t
{
    private static String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static String[] hundreds = {"", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion"};
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to convert: ");
        double numDoub = input.nextDouble();
        
        int numInt = (int)numDoub;
        int cents = (int)(100*(numDoub-numInt));
        
        int length = String.valueOf(numInt).length();
        
        if (length==1)
        {
            
        }
        if (length==2)
        {
        }
         
    }
}
