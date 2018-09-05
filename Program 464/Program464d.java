/**
 * Shai Caspin
 * 04/05/2017
 * Carrboro High School
 * Program 464d - transpose an array
 * 
 * Description: Read a 5 X 5 two-dimensional array from an external data file.  
 *              The data is stored in rows.  Print the original array and its 
 *              transpose with appropriate labels as shown.
 * What I learned: I learned how to use and manipulate multidimensional arrays.
 * Difficulties: none.
 */

import java.util.*;
import java.io.*;

public class Program464d
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
       int matrixOld[][] = new int[5][5];
       int temp;
       //Run through the data and input to appropriate spot in matrix
       for (int i = 0; i<5; i++)
       {
            for (int j = 0; j<5; j++)
            {
                temp = inFile.nextInt();
                matrixOld[i][j] = temp;
            }
       }
       
       //***************************************************************************
       //CODE TO TRANSPOSE THE MATRIX
       //***************************************************************************
       
       int matrixNew[][] = new int[5][5];
       for (int i = 0; i<5; i++)
       {
            for (int j = 0; j<5; j++)
            {
                matrixNew[j][i] = matrixOld[i][j];
            }
       }
       
       //***************************************************************************
       //PRINT THE NEW AND OLD MATRIX
       //***************************************************************************
       
       //old matrix print
       System.out.println("Original Matrix");
       for (int i = 0; i<5; i++)
       {
           
           for (int j = 0; j<5; j++)
           {
               System.out.print(matrixOld[i][j]+"\t");
            }
           
           System.out.println();
        }
        
       //new matrix print 
       System.out.println("\nTransposed matrix");
       for (int i = 0; i<5; i++)
       {
           
           for (int j = 0; j<5; j++)
           {
               System.out.print(matrixNew[i][j]+"\t");
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

Transposed matrix
45  -3  96  14  19  
67  -6  81  -7  43  
89  -7  -8  72  28  
12  -4  52  29  63  
-3  -9  12  -1  87  

 * 
 * 
 */