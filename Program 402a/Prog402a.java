
/**
 * Shai Caspin
 * 2/17/17
 * Carrboro High School (NCVPS)
 * Program 402a-scores and differences
 * 
 * Description: This program eads 20 pairs of numbers (ID number and score respectively) into two separate arrays.  
 *              Then it finds the average score and prints a table of the ID, score and difference (score - average) 
 *              for each student, one student per line. It also rints the sum, average, and count of score at the head of the table as shown. 
 * What I learned: How to use and define values of arrays from an outside data source.
 */

import java.util.*;
import java.io.*;

public class Prog402a
{
    public static void main(String[] args)
    {
       //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog402a.dat"));
            
        }
        catch (FileNotFoundException e) //output if file cannot be found
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
       
       //Create arrays for ID and Score, each with size of 20 values of integers
       int[] id = new int[20];
       int[] score = new int[20];
       
       //Assign values from outside file to array
       int num = 0;
       while (inFile.hasNextLine() && num<20)
       {
            id[num]=inFile.nextInt();
            score[num]=inFile.nextInt();
            
            //use as a counter for 20 lines
            num++;

        }
       System.out.println("End of reading from file."); //Print once all data is assigned to arrays
       
       //Sum up all values of score array
       int total = 0;
       for (int s: score)
       {
           total=total+s;
        }
       //Calculate the avergae of all scores 
       double average = (int)((total/(double)id.length)*100+0.5)/100.00; 
       
       //Print the overall metadata
       System.out.println("Sum = " + total+"\nAverage = " +average+"\nCount = "+id.length); 
       
       //Print table
       System.out.println("\nID\t\tScore\t\tDiff"); 
       for (int i=0; i<20; i++)
       {
           System.out.println(id[i]+"\t\t"+score[i]+"\t\t"+(int)((score[i]-average)*100+0.5)/100.00);
        }
    }
}
/**
 * Sample output
 * 
End of reading from file.
Sum = 4853
Average = 242.65
Count = 20

ID		Score	  Diff
115		257		 14.35
123		253		 10.35
116		246		  3.35
113		243		  0.35
112		239		 -3.64
104		239		 -3.64
110		238		 -4.64
218		243		  0.35
208		242		 -0.64
222		223		-19.64
223		230		-12.64
213		229		-13.64
207		228		-14.64
203		224		-18.64
305		265		 22.35
306		262		 19.35
311		256		 13.35
325		246		  3.35
321		245		  2.35
323		245		  2.35
 *
 *
 *
End of reading from file.
Sum = 9340
Average = 467.0
Count = 20

ID		Score		Diff
100		100		 -366.99
200		200		 -266.99
300		300		 -166.99
400		400		  -66.99
500		500		    33.0
600		600		   133.0
700		700		   233.0
800		800		   333.0
900		900		   433.0
100		100		 -366.99
200		200		 -266.99
300		300		 -166.99
400		400		  -66.99
500		500		    33.0
600		600		   133.0
700		700		   233.0
800		800		   333.0
900		900		   433.0
150		190		 -276.99
190		150		 -316.99
 *
 */