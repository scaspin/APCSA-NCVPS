
/**
 * Shai Caspin
 * 03/11/2017
 * Carrboro Hs (NCVPS)
 * Program 460a - Binary search
 * 
 * Description: This program asks users for a number and searches the position of a number in a given
 *              inputted array,returning index (or a message that it did not exist within array)
 * What I learned: I learned the fundamentals of binary search.
 * Difficulties: I didn't figure out I had to add 1 and subtract 1 from the new definitions of high and 
 *              low points until I realized the program did not work otherwise since the low value would
 *              always be less than the large value.
 */

import java.util.*;
import java.io.*;

public class Program460a
{
    public static void main(String[] args)
    {
       //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       Scanner input = new Scanner(System.in);
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("sort (1).dat"));
        } 
       catch (FileNotFoundException e) //output if file cannot be found
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
       
       //Enter all data from input file into an array 
       int[] nums = new int[60] ;
       for (int i = 0; i < nums.length; i++)
       {
           nums[i] = inFile.nextInt();
        }
        
       //Get user data regarding number to search for and prints out message from method
       System.out.print("Enter a number to search for: ");
       int userNum = input.nextInt();
       
       //call method and prints messaeg
       System.out.println(searchPosition(userNum, nums));
    }
    
    //METHOD TO RETURN STRING WITH INDEX OR MESSAGE THAT INDEX DOES NOT EXIST
    public static String searchPosition(int num, int[] array)
    {
        //set low and high index values for search to happen between
        int lowVal = 0;
        int highVal = array.length-1;
        
        //algorithm works as long as higher span is greater than lower
        while (lowVal< highVal)
        {
            //mid point is found by lowest point plus 1/2 of the difference between low and high points
            int mid = lowVal + ((highVal-lowVal)/2);
            
            //see where searched number lies in realtion with mindpoint
            //adjust midpoint accordingly to continue search
            if (num<array[mid])
            {
                highVal = mid-1;
            }
            else if (num>array[mid])
            {
                lowVal = mid+1;
            }
            else if (num==array[mid])
            {
                return "Your number occurs at index " + mid;
            }
        }
        
        //default return if number is never found
        return "The number does not occur within list";
    }
}

/**
 * Sample output
 * 
Enter a number to search for: 110
The number does not occur within list
 * 
Enter a number to search for: 92
Your number occurs at index 52
 * 
 * 
Enter a number to search for: 60
Your number occurs at index 40

 * 
 * 
Enter a number to search for: 17
The number does not occur within list
 * 
 * 
 */