/**
 * Shai Caspin
 * 04/05/2017
 * Carrboro High School
 * Program 470d - adding diagonals
 * 
 * Description: Read a 5 X 5 two-dimensional array from an external data file.  
 *              The data is stored in rows.  Find the two diagonal sums and print 
 *              the array and the sums with labels as shown
 * What I learned: I learned how to use and manipulate multidimensional arrays.
 * Difficulties: none.
 */

import java.util.*;
import java.io.*;

public class Program470b
{
    public static void main(String[] args)
    {
       //***************************************************************************
       //INPUT MATRIX TO A 2D ARRAY
       //***************************************************************************
       
       //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("prog464a.dat"));
            } 
       catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }

       //Declare all variables for the original matrix 
       int matrix[][] = new int[5][5];
       int temp;
       //Run through the data and input to appropriate spot in matrix
       for (int i = 0; i<5; i++)
       {
            for (int j = 0; j<5; j++)
            {
                temp = inFile.nextInt();
                matrix[i][j] = temp;
            }
       }
       
       //***************************************************************************
       //CODE TO FIND DIAGONALS
       //***************************************************************************
       
       //diagonal one
       int diagonal1 = 0;
       for (int i = 0; i<5; i++)
       {
            diagonal1 = diagonal1 + matrix[i][i];
       }
       
       //diagonal 2
       int diagonal2 = 0;
       for (int i = 0; i<5; i++)
       {
            diagonal2 = diagonal2 + matrix[i][4-i];
       }
       
       //***************************************************************************
       //PRINT THE MATRIX AND DIAGONALS
       //***************************************************************************
    
       for (int i = 0; i<5; i++)
       {
           
           for (int j = 0; j<5; j++)
           {
               System.out.print(matrix[i][j]+"\t");
            }
           System.out.println();
        }
        
       System.out.println("Main diagonal sum : " + diagonal1);
       System.out.println("Other diagonal sum : " + diagonal2);
    }
}

/**
 * Sample output
 * 
45	67	89	12	-3	
-3	-6	-7	-4	-9	
96	81	-8	52	12	
14	-7	72	29	-1	
19	43	28	63	87	
Main diagonal sum : 147
Other diagonal sum : -3
 *
 */