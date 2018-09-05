
/**
 * Shai Caspin
 * 10/19/16
 * Carrboro HS (NCVPS)
 * Program 165a- Wedge of stars
 * 
 * Description: This program prints a wedge of stars with a given number of columns and rows given by the user.
 * What I learned: I learned how and when to decrement numbers within a while loop.
 * Difficulties: I tried using for loops which didn't work so I then switched to while loops which worked out.
 * 
 */

import java.io.*;
import java.util.*;


public class WedgeOfStars
{
   public static void main(String[] args)
   {
       Scanner stars = new Scanner(System.in); //get input
       System.out.print("Enter the starting size of the wedge: "); //
       int numRows = stars.nextInt(); //declare number of stars (in wedge and in lines)
                  
       int numStars; //allows for more flexibility with code
       while (numRows >0) //Starts at said variable and goes down to one
       {
           System.out.println();//new line
           numStars=1;  //reset number of stars
            while(numStars <= numRows)//prints stars up to initial number of stars given
            {  
             System.out.print("*");  
             numStars++;  //incremembting
            }  
           numRows--;  //decrementing
        }
      
    }
}
/**
 * Sample output
 * 
Enter the starting size of the wedge: 7

*******
******
*****
****
***
**
*

 * 
 * 
 * 
Enter the starting size of the wedge: 10

**********
*********
********
*******
******
*****
****
***
**
*

 *
 *
 *
Enter the starting size of the wedge: 5

*****
****
***
**
*

 *
 *
 *
Enter the starting size of the wedge: 23

***********************
**********************
*********************
********************
*******************
******************
*****************
****************
***************
**************
*************
************
***********
**********
*********
********
*******
******
*****
****
***
**
*


 */