/**
 * Shai Caspin
 * 04/05/2017
 * Carrboro High School
 * Program 464a - storing largest element in row
 * 
 * Description: Read a 5 X 5 two-dimensional array from an external data file. 
 *              The data is stored in rows.  Find the largest element in each 
 *              row and store it in a sixth column.  Print out the 6 X  5 array.
 * What I learned: I learned how to use and manipulate multidimensional arrays.
 * Difficulties: none.
 */

import java.util.*;
import java.io.*;

public class Program464a
{
    public static void main(String[] args)
    {
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

       //Declare all variables for the matrix 
       int matrix[][] = new int[5][6];
       int temp;
       int tempMax=-100;
       
       //Run through the data and input to appropriate spot in matrix
       for (int i = 0; i<5; i++)
       {
            tempMax=-100;
           
            for (int j = 0; j<5; j++)
            {
                temp = inFile.nextInt();
                matrix[i][j] = temp;
                
                //Find largest element in row of matrix
                if (temp>tempMax)
                {
                    tempMax = temp;
                }
            }
            
            //Input 6th collumn of largest numbers
            matrix[i][5] = tempMax;
       }
        
       //Print the elements of the matrix by collumn and row
       for (int i = 0; i<5; i++)
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
45  67  89  12  -3  89  
-3  -6  -7  -4  -9  -3  
96  81  -8  52  12  96  
14  -7  72  29  -1  72  
19  43  28  63  87  87  
 * 
 */