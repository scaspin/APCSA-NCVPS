
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 10/12/16
 * Program 155t - Finding sum and average of imported data
 * 
 * Description: This program finds suf, average, and the number of scores inputted from a data file. 
 *              The program stops once a score of 0 is reached in the date, and only works with 
 *              integer scores. The output is of all scores in order, the sum, number of scores, and average.
 * What I learned: I learned how to input data from an external file, as well as use a try catch statment
 *                 to determine whether or not the data file was read or not. I also learned how to use the date
 *                 from the external file in a loop as the numbers are read from it.
 * Difficulties: It took me a while to reconfigure the loop so that it would stop once it reaches 0. I eventually
 *               moved the "next integer" step to the end of the previous loop so that the loop would terminate
 *               if the score is 0.
 */

import java.util.Scanner;
import java.io.*;

public class FindingSumAndAverage
{
    public static void main(String[] args)
    {
       
       Scanner inFile = null; //establish scanner
       try 
        {
            // defite the scanner to read the file
                inFile = new Scanner (new File("data.doc"));
           
            } 
         catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
       
       System.out.println("The scores are: ");
        
       int n=0;
       int sum=0;
       int score= inFile.nextInt(); 
       
       //gets loop to run with intiital integer, works better since in loop since then we get the other integer
       // after printing, which reevaluates the loop and makes sure it doesn't run with zero.
       
       while(score!=0) // returns false at end of file
           {
            // read and print the next integer
            
            System.out.println(score); //print the raw score
            n++; //counter for how many times loop runs to know how many numbers series has
            sum+=score; //calculates sum
            score = inFile.nextInt(); //brings next integer before reevaluation of loop
           }
       
       double average = (double)sum/n; //calculate average 
       
       //output formatting
       System.out.println("\nThe sum of the scores is: " + sum);
       System.out.println("The number of scores is: " + n );
       System.out.println("The average of the scores is: " +average);
       
    }
}
/**
 * Sample output:
 * 
The scores are: 
3
8
1
13
18
15
7
17
1
14
The sum of the scores is: 97
The number of scores is: 10
The average of the scores is: 9.7
 */