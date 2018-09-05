
/**
 * Shai Caspin
 * 11/15/16
 * Carrboro High School (NCVPS)
 * Program 209a- counting numbers
 * 
 * Description: This program reads an external file of random integer values until the end of file is found.  
 *              As you read the file you should determine how many numbers are less than the value 500 and 
 *              how many numbers are greater than or equal to 500.
 * What I learned: I learned how to use the scanner class to read external files.
 * Difficulties: I initially had the data as a doc file and it took me a while to realize I had to covnert
 *               the document to a plain text document for the program to work.
 */

import java.io.*;  
import java.util.*;


public class Prog209a
{
    public static void main (String args[])
    {  
       
       Scanner inFile = null; //establish scanner
       try 
        {
            // defite the scanner to read the file
                inFile = new Scanner (new File("p209a.txt"));
           
            } 
       catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
       
       int number; //number
       int lesser = 0; //count of numbers less than 500
       int greater = 0;//count of numbers greater than 500 or equal to 500
       int count = 0; // count of how many numbers are imported from the file

       while(inFile.hasNext()== true) // goe on for all integers in document
       {
            number = inFile.nextInt(); //set next number to test
           
            //Increment numbers accordingly
            if (number<500)
                {
                    lesser++;
                }
            else
                {
                    greater++; 
                }
            
            count ++;    
        }
       
       //Print results 
       System.out.println("There are " + lesser + " numbers less than 500.");
       System.out.println("There are " + greater + " numbers greater than 500.");
       System.out.println("The total number of numbers is: " + count);
    }
}
/**
 * Sample output
 * 
There are 263 numbers less than 500.
There are 237 numbers greater than 500.
The total number of numbers is: 500
 * 
 */