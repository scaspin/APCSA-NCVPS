
/**
 * Shai Caspin
 * 11/30/16
 * Carrboro HS (NCVPS)
 * Progeam 500c - fooling around with strings
 * 
 * Description: One of your classmates just wrote a program that continuously scrolls a line of text vertically on 
 *              the screen.  You think it would be a lot “cooler” to have a program that asks for some text and then 
 *              repeats it once for every character in the line of text.
 * what I learned: I learned how to use string objects and methods.
 * Difficulties: None.
 */

import java.util.*;
import java.io.*;

public class Prog500c
{
    public static void main(String[] args)
    {
        //GET USER INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite word: ");
        String word = input.nextLine();
        
        //CALCULATE LENGTH OF WORD AND PRINT NUM
        int wordLength = word.length();
        System.out.println("The length of the word is " + wordLength + " characters.\n");
        
        //PRINT THE WORDS THE NUM OF LETTERS WITHIN IT
        for (int times=1; times<=wordLength; times++)
        {
            System.out.println(word);
        }
        
        System.out.print("\nSo I printed it " + wordLength + " times.");
        
    }
}
/**
 * Sample Output
 * 
Enter your favorite word: howdy
The length of the word is 5 characters.

howdy
howdy
howdy
howdy
howdy

So I printed it 5 times.
 * 
 * 
 * 
Enter your favorite word: P!nk
The length of the word is 4 characters.

P!nk
P!nk
P!nk
P!nk

So I printed it 4 times.
 * 
 * 
 * 
Enter your favorite word: Because
The length of the word is 7 characters.

Because
Because
Because
Because
Because
Because
Because

So I printed it 7 times.
 * 
 * 
 * 
Enter your favorite word: Programming
The length of the word is 11 characters.

Programming
Programming
Programming
Programming
Programming
Programming
Programming
Programming
Programming
Programming
Programming

So I printed it 11 times. 
 * 
 * 
 *
Enter your favorite word: computers
The length of the word is 9 characters.

computers
computers
computers
computers
computers
computers
computers
computers
computers

So I printed it 9 times. 
 */