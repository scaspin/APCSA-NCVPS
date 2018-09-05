/**
 * Shai Caspin
 * 04/05/2017
 * Carrboro High School
 * Program 465a - storing largest numbers
 * 
 * Description: Read two sets of numbers into two 2-dimensional arrays.  
 *              Compare the corresponding elements of these arrays and place the 
 *              larger of the two numbers in the corresponding position of a third array.  
 *              Display the three arrays attractively.  
 * What I learned: I learned how to use and manipulate multidimensional arrays.
 * Difficulties: none.
 */

import java.util.*;
import java.io.*;

public class Program465a
{
    public static void main(String[] args)
    {
       //***************************************************************************
       //INPUT MATRIX TO A 2D ARRAY
       //***************************************************************************

       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("prog465a.dat"));
            } 
       catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }

       //Declare all variables for the original matrix 
       int matrix1[][] = new int[4][4];
       int matrix2[][] = new int[4][4];
       int temp;
       
       //Run through the data and input to appropriate spot in matrix 1
       for (int i = 0; i<4; i++)
       {
            
            for (int j = 0; j<4; j++)
            {
                temp = inFile.nextInt();
                matrix1[i][j] = temp;
            }
            
       }
       //Run through the data and input to appropriate spot in matrix 2
       for (int i = 0; i<4; i++)
       {
            
            for (int j = 0; j<4; j++)
            {
                temp = inFile.nextInt();
                matrix2[i][j] = temp;
            }
            
       }
        
       //***************************************************************************
       //Find the new matrix with largest numbers
       //***************************************************************************
       int matrixNew[][] = new int[4][4];
       int temp1;
       int temp2;
       for (int i = 0; i<4; i++)
       {
            
            for (int j = 0; j<4; j++)
            {
                temp1 = matrix1[i][j];
                temp2 = matrix2[i][j];
                
                if (temp1>temp2)
                {
                    matrixNew[i][j] = temp1;
                }
                else 
                {
                    matrixNew[i][j] = temp2;
                }
            }
            
       }
       
       
       
       //***************************************************************************
       //PRINT THE MATRICIES
       //***************************************************************************
       
       System.out.println("Matrix 1");
       for (int i = 0; i<4; i++)
       {
           
           for (int j = 0; j<4; j++)
           {
               System.out.print(matrix1[i][j]+"\t");
            }
           System.out.println();
        }
        
       System.out.println("\n\nMatrix 2");
       for (int i = 0; i<4; i++)
       {
           
           for (int j = 0; j<4; j++)
           {
               System.out.print(matrix2[i][j]+"\t");
            }
           System.out.println();
        }
       
       System.out.println("\n\nNew Matrix");
       for (int i = 0; i<4; i++)
       {
           
           for (int j = 0; j<4; j++)
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
Matrix 1
2	7	6	4	
6	1	2	4	
9	7	2	6	
8	3	2	1	


Matrix 2
4	1	3	7	
6	2	3	8	
7	2	2	4	
4	2	3	1	


New Matrix
4	7	6	7	
6	2	3	8	
9	7	2	6	
8	3	3	1	
 */