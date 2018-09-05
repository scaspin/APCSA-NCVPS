
/**
 * Shai Caspin
 * 02/17/17
 * Carrbro High School (NCVPS)
 * Program 404a-separating positive-negative numbers into arrays
 * 
 * Description: This program reads a list of numbers from an external file, places the positive numbers into 
 *              two arrays based on negative or positive numebrs. This it displays the numbers in table form.
 * What I learned: I learned how to use arrays in importing data.
 */

import java.util.*;
import java.io.*;

public class Program404a
{
   public static void main(String[] args)
   {
       
       //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog404a2.dat"));
            
        }
        catch (FileNotFoundException e) //output if file cannot be found
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
       
       //Establish the two arrays for positive and negative numbers with really high capacity since the number is unknown
       int[]  = new int[21];
       int[] neg = new int[21];
       
       //Allow for proper placement of numbers into the arrays regardless of order.
       int num = 0;
       int countPos = 0;
       int countNeg = 0;
       while (inFile.hasNextLine())
       {
           //import integer
           num = inFile.nextInt();
           
           //Determine whether or not the number is positive or negative
           if(num>0)
           {
               pos[countPos] = num;
               countPos++;
            }
           else if (num<0) 
           {
               neg[countNeg] = num;
               countNeg++;
            }
       }
       
       //Print the table of values based on arrays of any given length
       System.out.println("Positive\tNegative");
       for (int i =0; (i<countPos || i<countNeg); i++)
       {
           System.out.println("\t"+pos[i]+"\t"+neg[i]);
        }
   }
}

/**
 * Sample output
 * 
 * 
Positive	Negative
	3	        -8
	66	       -16
	54	       -56
	22	       -34
	19	       -22
	21	       -55
	34	        -3
	64	       -55
	55	       -76
	9	       -45
	39	 
	54
	33	
 *
 *
 *
Positive	Negative
	8       	-3
	10	        -66
	56	        -54
	34	        -22
	22	        -19
	55	        -21
	3	        -34
	55	        -64
	76	        -55
	45	        -9
		        -89
		        -54
		         -3
		        -25

 */