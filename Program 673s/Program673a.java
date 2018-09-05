
/**
 * Shai Caspin
 * Carrboro HS
 * 12/21/16
 * Astricks revised
 * 
 * Description:Earlier in the semester we wrote some programs that made triangles out of *’s.  
 *             So much of this project is already done for you.
 * What I learned: I learned how to use methods and call them.
 * Difficulties: SO MUCH CODE
 * 
 * 
 *!!!!! I did not give comments on the internal triangle programs becuase it was already done elsewhere!!!!
 */

import java.util.*;
import java.io.*;

public class Program673a
{
    static Scanner input = new Scanner(System.in);
    
    //Main method
    public static void main(String[] args)
    {
        System.out.println("Please choose one of the following types of triangles:\n"); 
        System.out.println("Types of Triangles\n\t1.Left\n\t2.Right\n\t3.Center" );
        System.out.print("\nEnter a number from the menu: ");
        int choice = input.nextInt();
        System.out.print("How many rows would you like? ");
        int row = input.nextInt();
        
        //Goes to different functions based on choice and then ends program
        switch (choice)
        {
            case 1: leftTriangle(row);
                    break;
            case 2: rightTriangle(row);
                    break;
            case 3: centerTriangle(row);
                    break;
            default: System.out.print("You didn't enter a number from the menu, try again!");
                    break; 
                
            //I chose to get print within each function because returning a string value of multiple lines was complicated
          }
    }
    
    //Left Triangle
    public static void leftTriangle(int num)
    {
        for (int row = 1; row<=num ; row++)
        {
            System.out.println("");
            for (int star = 1; star<=row; star++)
            {
                System.out.print("*");
            }
        }
    }
    
    //Right Triangle
    public static void rightTriangle(int num)
    {
        for (int row = 1; row<=num ; row++)
        {
            System.out.println("");
            for (int space = num-row-1; space>=0; space--)
                {
                    System.out.print(" ");
                }
            for (int star = 1; star<=row; star++)
            {
                System.out.print("*");
            }
        }
    }
    
    //Center Triangle
    public static void centerTriangle(int num)
    {
        System.out.println("");
        for (int numStars=1; numStars<(num*2); numStars += 2)//every row has an additional two stars for 6 rows
        {
            for (int spaces=0; spaces <= (num - numStars / 2); spaces++)//spaces are 5-half a side of column
            {
                System.out.print(" "); //print space
            }
            
            for (int starsPrinted=0; starsPrinted<numStars; starsPrinted++) //print stars
            {
                System.out.print("*");
            }
            System.out.println(); //new line
        }
    }
}
/**
 * Sample output
 * 
Please choose one of the following types of triangles:

Types of Triangles
	1.Left
	2.Right
	3.Center

Enter a number from the menu: 1
How many rows would you like? 6

*
**
***
****
*****
******
 * 
 * 
 * 
Please choose one of the following types of triangles:

Types of Triangles
	1.Left
	2.Right
	3.Center

Enter a number from the menu: 2
How many rows would you like? 9

        *
       **
      ***
     ****
    *****
   ******
  *******
 ********
*********
 * 
 * 
 * 
Please choose one of the following types of triangles:

Types of Triangles
	1.Left
	2.Right
	3.Center

Enter a number from the menu: 3
How many rows would you like? 10

           *
          ***
         *****
        *******
       *********
      ***********
     *************
    ***************
   *****************
  *******************

 * 
 * 
 * 
lease choose one of the following types of triangles:

Types of Triangles
	1.Left
	2.Right
	3.Center

Enter a number from the menu: 3
How many rows would you like? 2

   *
  ***
 
 * 
 * 
 */