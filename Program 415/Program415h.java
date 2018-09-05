
/**
 * Shai Caspin
 * 02/20/17
 * Carrboro HS (NCVPS)
 * Program 415h avoiding duplicates
 * 
 * Description: Read in 20 numbers, each of which is between 10 and 100, inclusive. As each number is read, 
 *              print it only if it is not a duplicate of a number already read.  Provide for the "worst case" 
 *              in which all 20 numbers are different Use the smallest possible array to solve this problem.
 * Difficulties: Getting the program to recognize that they're equal.
 */

import java.io.*;
import java.util.*;

class Program415h
{
    public static void main(String[] args)
    {
       //Set up scanner to input data
       Scanner inFile = null; //establish scanner
       try 
       {
            // define the scanner to read the file
             inFile = new Scanner (new File("prog415h.dat"));
            
       } 
       catch (FileNotFoundException e) //output if file cannot be found
       {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
    
       }
       
       //establish array
       int[] nums = new int[20];
       
       //Set numbers in from file and print them
       System.out.print("The original set of numbers is: ");
       for (int i = 0; i<20; i++)
       {
           nums[i]=inFile.nextInt();
           
           System.out.print("  "+nums[i]);
        }
       
       //Print out unique problems 
       System.out.print("\nThe different numbers from the set of integers are:" );
       for (int i=0; i<20; i++)
       {
           innerloop:
           for (int j=i; j>0; j--)
           {
               if (nums[i]==nums[j])
               {
                   break innerloop;
                }
               System.out.print("  "+nums[i]);
            }
        }
    }
}
/**
 * Sample output
 * 
The original set of numbers are: 12 12 30 12 45 66 78 30 82 19 99 11 11 15 31 18 51 17 12 17 
The different numbers from the set of integers are:12 30 45 66 78 82 19 99 11 15 31 18 51 17
 * 
 */