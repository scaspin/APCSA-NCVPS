
/**
 * Shai Caspin
 * 02/20/17
 * Carrboro High School (NCVPS)
 * Program 408a-ranking test scores
 * 
 * Description: This program reads 25 pairs of numbers (ID number and score respectively) into two separate arrays.  
 *              Then it prints the numbers paired and ranked by score from high to low with column headings.  
 * What I learned: I learned how to incorporate iterated loops to run through arrays             
 * Difficluties: My initialization of the greatest number was outside of the loop previously which didn't work.
 */
import java.util.*;
import java.io.*;

public class Program408a
{
    public static void main(String[] args)
   {
       //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog408a.dat"));
            
        }
        catch (FileNotFoundException e) //output if file cannot be found
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        
       //Variable decleration creating arrays for ID and scores 
       int[] id = new int[25];
       int[] scores = new int[25];
       
       //Allows for proper placement of numbers into the arrays 
       int count = 0;
       while (count<25)
       {
           //import integer
           id[count]=inFile.nextInt();
           scores[count] = inFile.nextInt();
           
           count++;
        }
        
       //Print header 
       System.out.println("ID\tScore");
       
       //Declare variables for sorting
       int largest=0;
       int idLargest = 0;
       for (int i = 0; i<= 24; i++) //find the 25 greatest numbers in order, perform outer loop 25 times
       {
           largest = 0;
           for (int j = 0; j<=24; j++) //runs through numbers by index
           {
               if (scores[j]>largest) //redefines largest value based on indec
               {
                   largest = scores[j];
                   idLargest = j;
                }
            }
           //Prints largest value found with ID 
           System.out.println(id[idLargest]+"\t" + scores[idLargest]);
           
           //Turns the score negative to make sure it isn't seen as largest in the next read
           scores[idLargest] = -1 * scores[idLargest];
       }
       
       //Display that all scores were read and sorted
       System.out.println("\nAll the scores have been sorted");
    }
}
/**
 * Sample output
 * 
ID	Score
001	599
004	560
003	559
002	513
365	265
306	262
115	257
311	256
123	253
325	246
116	246
323	245
321	245
113	243
218	243
208	242
302	242
104	239
112	239
110	238
223	230
213	229
207	228
203	224
222	223

All the scores have been sorted
 *
 *
 *
 */
