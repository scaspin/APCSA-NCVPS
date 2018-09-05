/**
 * Shai Caspin
 * 04/07/2017
 * Carrboro High School
 * Program 465a - sparse matrix
 * 
 * Description: This program that reads a two-dimensional array, one row at a time. Then prints out both arrays. 
 *              Determine which form, the two-dimensional array or the Reduced Representation, is more efficient.
 * What I learned: I learned how to use and manipulate multidimensional arrays.
 * Difficulties: I used methods in this program to make it easier to follow.
 */

import java.util.*;
import java.io.*;

public class Program465h
{
    public static void main(String[] args)
    {
       //Set up scanner to  get input from dat file
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("prog465h.dat"));
            } 
       catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        
       while (inFile.hasNext())
       {
           System.out.println("Original Matrix\n");
           int[][] matrix = scanMatrix(inFile);
           printMatrix(matrix);
           int[][] sparseMatrix = sparseMatrix(matrix);
           System.out.println("\nSparse Matrix\n");
           printMatrix(sparseMatrix);
           
           int rows = matrix.length;
           int collumns = matrix[0].length;
           
           int rowsSparse = sparseMatrix.length;
           int colSparse = sparseMatrix[0].length;
           
           //check which matrix is more efficient
           if ((rows*collumns)==(rowsSparse*colSparse))
           {
               System.out.println("Original and sparse are equally efficient");
            }
           else if ((rows*collumns)>(rowsSparse*colSparse))
           {
               System.out.println("Original matrix is more efficient");
            }
           else if ((rows*collumns)<(rowsSparse*colSparse))
           {
               System.out.println("Original and sparse are equally efficient");
            }
           
        }
    }
    
    //scan matrix
    public static int[][] scanMatrix(Scanner input)
    {
        int dimension1 = input.nextInt();
        int dimension2 = input.nextInt();
        
        int[][] matrix = new int[dimension1][dimension2];
        
        for (int i = 0; i<dimension1; i++)
        {
            for (int j=0; j<dimension2; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
    
    //print matrix
    public static void printMatrix(int[][] matrix)
    {
       for (int i = 0; i<matrix.length; i++)
       {
           for (int j = 0; j<matrix[0].length; j++)
           {
               System.out.print(matrix[i][j]+"\t");
            }
           System.out.println();
        }
    }
    
    //sparse matrix
    public static int[][] sparseMatrix(int[][] originalMatrix)
    {
       //Find size of new sparsed matrix
       int rowsSprase = 0;
       for (int i = 0; i<originalMatrix.length; i++)
       {
           for (int j = 0; j<originalMatrix[0].length; j++)
           {
               if(originalMatrix[i][j]!=0)
               {
                   rowsSprase++;
                }
            }
        }
       
       int[][] sparseMatrix = new int[rowsSprase][3];
       
       //find elemtns that are not equal to zero and input them into sprase amtrix
       rowsSprase = 0;
       for (int i = 0; i<originalMatrix.length; i++)
       {
           for (int j = 0; j<originalMatrix[0].length; j++)
           {
               if(originalMatrix[i][j]!=0)
               {
                   sparseMatrix[rowsSprase][0] = i+1;
                   sparseMatrix[rowsSprase][1] = j+1;
                   sparseMatrix[rowsSprase][2] = originalMatrix[i][j];
                   rowsSprase++;
                }
            }
        }
       
       return sparseMatrix;
    }
}
/**
 * Sample output
 * 
Original Matrix

0   0   7   0   0   0   
0   0   0   0   -8  0   
0   0   0   0   0   0   
2   0   0   0   0   0   
0   0   0   0   0   0   

Sparse Matrix

1   3   7   
2   5   -8  
4   1   2   
Original matrix is more efficient


Original Matrix

0   2   0   3   0   1   
8   0   4   0   1   0   
0   3   0   1   0   -7  
5   0   9   0   6   0   
0   2   0   -1  0   7   

Sparse Matrix

1   2   2   
1   4   3   
1   6   1   
2   1   8   
2   3   4   
2   5   1   
3   2   3   
3   4   1   
3   6   -7  
4   1   5   
4   3   9   
4   5   6   
5   2   2   
5   4   -1  
5   6   7   
Original and sparse are equally efficient


Original Matrix

0   0   1   0   0   2   
3   0   0   4   0   0   
0   0   5   0   0   6   
7   0   0   8   0   0   
0   0   9   0   0   1   

Sparse Matrix

1   3   1   
1   6   2   
2   1   3   
2   4   4   
3   3   5   
3   6   6   
4   1   7   
4   4   8   
5   3   9   
5   6   1   
Original and sparse are equally efficient

 * 
 */