
/**
 * Shai Caspin
 * 10/22/16
 * Carrboro Hs (NCVPS)
 * Program 166g- Bermuda Triangle (Multiplication triangle)
 * 
 * Description: This program that accepts a number of rows and columns (same number) between 2 and 10 and
 *              produces a multiplication triangle of n rows.
 * What I learned: I learned how to use interated loops to produce tables and how to use a Do while loop to 
 *               check condtition for the big part of the program to run.
 * Difficulties: I tried to incorporate the do wHile loop into the actual production of the table, which didn't work very well.
 */
import java.io.*;
import java.util.* ;

public class BermudaTriangle
{
   public static void main(String[] args)
   {
       System.out.println("MULTIPLICATION TRIANGLES");
       
       Scanner rowsInput = new Scanner(System.in);
       int rows=4;  //make initial table a 4x4 table
       
       do {
        System.out.println("\nNumber of rows/columns in this multiplication triangle: " +rows); //informs user of num of rows
        
        //print header of alll numbers from 1 to chosen number
        for (int i = 1; i <= rows; i++) 
        {
            System.out.printf(EasyFormat.format(i,10,0));
        }
        
        System.out.println(); //space between
        
        //actual table of multiplication
        for (int i = 1; i <= rows; i++) //first number in row (the one begin multiplied by ehader of column)
        {
            for (int j = 1; j <= i; j++) //column part of multiplication
            {
                System.out.printf(EasyFormat.format((i * j),10,0)); //print number
            }
            System.out.println();
        }
        
        //conditions for next table
        System.out.print("\nPlease enter the number of rows/columns you would like to print: ");
        rows = rowsInput.nextInt();
       
       } while (rows!=0);
       
       System.out.println("\nThank you for using this program!!!!");
      }
}

/**
 * Sample output
 * 
 * 
MULTIPLICATION TRIANGLES

Number of rows/columns in this multiplication triangle: 4
         1         2         3         4
         1
         2         4
         3         6         9
         4         8        12        16

Please enter the number of rows/columns you would like to print: 2

Number of rows/columns in this multiplication triangle: 2
         1         2
         1
         2         4

Please enter the number of rows/columns you would like to print: 7

Number of rows/columns in this multiplication triangle: 7
         1         2         3         4         5         6         7
         1
         2         4
         3         6         9
         4         8        12        16
         5        10        15        20        25
         6        12        18        24        30        36
         7        14        21        28        35        42        49

Please enter the number of rows/columns you would like to print: 0

Thank you for using this program!!!!
 *
 *
 *
 *
 *
 *
 *
MULTIPLICATION TRIANGLES

Number of rows/columns in this multiplication triangle: 4
         1         2         3         4
         1
         2         4
         3         6         9
         4         8        12        16

Please enter the number of rows/columns you would like to print: 9

Number of rows/columns in this multiplication triangle: 9
         1         2         3         4         5         6         7         8         9
         1
         2         4
         3         6         9
         4         8        12        16
         5        10        15        20        25
         6        12        18        24        30        36
         7        14        21        28        35        42        49
         8        16        24        32        40        48        56        64
         9        18        27        36        45        54        63        72        81

Please enter the number of rows/columns you would like to print: 3

Number of rows/columns in this multiplication triangle: 3
         1         2         3
         1
         2         4
         3         6         9

Please enter the number of rows/columns you would like to print: 4

Number of rows/columns in this multiplication triangle: 4
         1         2         3         4
         1
         2         4
         3         6         9
         4         8        12        16

Please enter the number of rows/columns you would like to print: 0

Thank you for using this program!!!!
 *
 *
 *
 *
 *
 *
 *
MULTIPLICATION TRIANGLES

Number of rows/columns in this multiplication triangle: 4
         1         2         3         4
         1
         2         4
         3         6         9
         4         8        12        16

Please enter the number of rows/columns you would like to print: 5

Number of rows/columns in this multiplication triangle: 5
         1         2         3         4         5
         1
         2         4
         3         6         9
         4         8        12        16
         5        10        15        20        25

Please enter the number of rows/columns you would like to print: 1

Number of rows/columns in this multiplication triangle: 1
         1
         1

Please enter the number of rows/columns you would like to print: 8

Number of rows/columns in this multiplication triangle: 8
         1         2         3         4         5         6         7         8
         1
         2         4
         3         6         9
         4         8        12        16
         5        10        15        20        25
         6        12        18        24        30        36
         7        14        21        28        35        42        49
         8        16        24        32        40        48        56        64

Please enter the number of rows/columns you would like to print: 12

Number of rows/columns in this multiplication triangle: 12
         1         2         3         4         5         6         7         8         9        10        11        12
         1
         2         4
         3         6         9
         4         8        12        16
         5        10        15        20        25
         6        12        18        24        30        36
         7        14        21        28        35        42        49
         8        16        24        32        40        48        56        64
         9        18        27        36        45        54        63        72        81
        10        20        30        40        50        60        70        80        90       100
        11        22        33        44        55        66        77        88        99       110       121
        12        24        36        48        60        72        84        96       108       120       132       144

Please enter the number of rows/columns you would like to print: 0

Thank you for using this program!!!!

 */