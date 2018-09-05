
/**
 * Shai Caspin
 * 11/30/16
 * Carrboro Hs (NCVPS)
 * Program 500e-dot leader
 * 
 * Description:A table of contents in many books use periods to align text with the page numbers.  
 *             These are called “dot leaders”. This program  accepts from the user a chapter title 
 *             and a page number. A line of output contains exactly fifty characters. The space between 
 *             the title and the page number will be filled with periods (“.”). For extra credit my 
 *             program is alternating periods and spaces but there is always a space before the page 
 *             number and after the chapter title. 
 * What I learned: I learned how to use methods for strings, how to get user input regarding strings, 
 *                and how to manupulate them using simple code.
 * Difficulties: I didn't remember the exact method name so I had to look back at my notes and find it, but that wasn't too hard.              
 *           
 */

import java.util.*;
import java.io.*;

public class Prog500e
{
   public static void main(String[] args)
   {
       //GET USER INPUT
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the title of the chapter: ");
       String title = input.nextLine() + " "; //Adjust string so there is always a space after the name
       System.out.print("Enter the page number: ");
       String page = input.nextLine();
       
       //Determine however many period/spaces are needed by subtracting length of strings from 50
       int numPeriod = 50 - title.length() - page.length();
       
       //OUTPUT
       System.out.print(title); 
       for (int period = (numPeriod/2); period>=0; period--)
       {
           System.out.print(". "); //Always a space before the page number
        }
       
       System.out.print(page);
    }
}

/**
 * Sample Output
 * 
Enter the title of the chapter: An Introduction to Java
Enter the page number: 5
An Introduction to Java . . . . . . . . . . . . .  5
 *
 *
Enter the title of the chapter: Simple Data Types
Enter the page number: 27
Simple Data Types . . . . . . . . . . . . . . . . 27
 *
 *
Enter the title of the chapter: Having Fun with Java
Enter the page number: 300
Having Fun with Java . . . . . . . . . . . . . . 300
 *                                                        
 *                                                        
Enter the title of the chapter: A cup of Java Juice   
Enter the page number: 2                             
A cup of Java Juice . . . . . . . . . . . . . . .  2
 */