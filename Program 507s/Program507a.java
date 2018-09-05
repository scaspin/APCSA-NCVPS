
/**
 * Shai Caspin
 * 12/06/16
 * Carrboro HS
 * Program 507a - thinking inside the box
 * 
 * Description:  Read a string from the keyboard.  Output the string centered inside of a box as shown below.  
 *               The box needs to be resized on each run to assure that it has the correct spacing.
 * What I learned: How to create boxes@
 * Difficulties: I'm not really sure if there's a better way to do this because the way I did it seems too easy.
 */

import java.util.*;
import java.io.*;

public class Program507a
{
    public static void main(String[] args)
    {
        //GET USER INPUT OF STRING
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        
        
        //GET LENGTH OF STRING
        int textLength = text.length();
        
        //PRINT UPPER LINE OF BOX
        for (int numStars = 1; numStars<=(textLength+6); numStars++)
        {
            System.out.print("*");
        }
        
        
        //PRINT FIRST LINE THAT IS BLANK WITH A STAR ON EACH SIDE
        System.out.print("\n*");
        for (int numStars = 1; numStars<=(textLength+4); numStars++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        
        //PRINT LINE OF BOX W/ACTUAL TEXT
        System.out.print("\n*  " +text+"  *");
        
        //PRINT SECOND LINE THAT IS BLANK WITH A STAR ON EACH SIDE
        System.out.print("\n*");
        for (int numStars = 1; numStars<=(textLength+4); numStars++)
        {
            System.out.print(" ");
        }
        System.out.print("*\n");
        
        
        //PRINT LOWER STAR LINE OF BOX
        for (int numStars = 1; numStars<=(textLength+6); numStars++)
        {
            System.out.print("*");
        }
    }
}
/**
 * Sample output
 * 
Enter a string: Thinking
**************
*            *
*  Thinking  *
*            *
**************
 * 
 * 
 * 
*************************************
*                                   *
*  Mr. Zaengle is my cool teacher!  *
*                                   *
*************************************
 * 
 * 
 * 
Enter a string: I
*******
*     *
*  I  *
*     *
*******
 * 
 * 
 * 
*************************************
*                                   *
*  This program is awesome!!! :)))  *
*                                   *
*************************************
 * 
 * 
 * 
Enter a string: I don't know what to write so here is a really long sentence with a box around it.
****************************************************************************************
*                                                                                      *
*  I don't know what to write so here is a really long sentence with a box around it.  *
*                                                                                      *
****************************************************************************************
 */