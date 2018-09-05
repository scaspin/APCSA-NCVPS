/**
 * Shai Caspin
 * 04/05/2017
 * Carrboro High School
 * Program 470c - adding rows and collums
 * 
 * Description: Read a 5 X 5 two-dimensional array from an external data file.  
 *              The data is stored in rows.  Print out the original matrix.  
 *              Then, you are to find the total of each row and column, store 
 *              them into the sixth positions in your matrix.  Finally print 
 *              out your new 6 X 6 matrix which includes the totals
 * What I learned: I learned how to use and manipulate multidimensional arrays.
 * Difficulties: none.
 */

import java.util.*;
import java.io.*;

public class Program470c
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
       int matrix[][] = new int[6][6];
       int temp;
       
       //Run through the data and input to appropriate spot in matrix
       for (int i = 0; i<5; i++)
       {
            int rowTotal = 0;
            for (int j = 0; j<5; j++)
            {
                temp = inFile.nextInt();
                matrix[i][j] = temp;
                rowTotal = rowTotal+temp; //find total of rows
            }
            
            matrix[i][5] = rowTotal;
       }
       
       System.out.println("Original Matrix");
       for (int i = 0; i<5; i++)
       {
           
           for (int j = 0; j<5; j++)
           {
               System.out.print(matrix[i][j]+"\t");
            }
           System.out.println();
        }
       
        
       //***************************************************************************
       //FIND TOTAL OF COLLUMNS AND ADD THEM TO MATRIX
       //***************************************************************************
       for (int i = 0; i<6; i++)
       {
            int collumnTotal = 0;
            for (int j = 0; j<5; j++)
            {
                temp = matrix[j][i] ;
                collumnTotal = collumnTotal+temp; //find total of rows
            }
            
            matrix[5][i] = collumnTotal;
       }
       
       
       
       //***************************************************************************
       //PRINT THE MATRIX AND TOTALS
       //***************************************************************************
       
       System.out.println("With totals");
       for (int i = 0; i<6; i++)
       {
           
           for (int j = 0; j<6; j++)
           {
               System.out.print(matrix[i][j]+"\t");
            }
           System.out.println();
        }
        
    }
}

/**
 * Sample output
 * 
Original Matrix
45  67  89  12  -3  
-3  -6  -7  -4  -9  
96  81  -8  52  12  
14  -7  72  29  -1  
19  43  28  63  87  

With totals
45  67  89  12  -3  210 
-3  -6  -7  -4  -9  -29 
96  81  -8  52  12  233 
14  -7  72  29  -1  107 
19  43  28  63  87  240 
171 178 174 152 86  761 

 * 
 */