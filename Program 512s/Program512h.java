
/**
 * Shai Caspin
 * Carrboro HS
 * Dec 13th 2016
 * 
 * Description: This program  reads text and determines the percentage of words having three letters.  
 *              For simplicity, use text without any punctuation.
 * What I learned: How to use conversion of string line to string array based on spaces in line.
 * Difficulties: Learning how to do what is specified in the above "what I learned" section.
 */

import java.util.*;
import java.io.*;

public class Program512h
{
    public static void main(String[] args)
    {
       //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("prog512h.dat"));
            
            
            } 
       catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
      
       //Initialize variables for counts and those used in loops
       int wordCount = 0;
       int wordLength = 0;
       int numOfThrees = 0;
       
       while (inFile.hasNextLine()) //Runs for as many lines as exist in the document
       {
             String line = inFile.nextLine(); //inputs the next line
             String[] wordArray = line.split(" "); //converts line to array of strings based on spaces between words
             for (String word:wordArray) //inspects every string within the array
             {
                    wordCount++; //adds the word to the total word count
                    wordLength=word.length(); //measures length of word
                    if (wordLength==3) //increments number of three when the word length is of 3 letters
                    {
                        numOfThrees++;
                    }
             }
             System.out.println(line) ; //prints out the line read
       }
        
       //calculates precentage of words that have 3 letters and round it to second decimal after converting to %
       double threePercent = (int)(((double)numOfThrees/wordCount)*10000+0.5)/100.00;
        
       //prints output of entire program
       System.out.println("\nThe total number of words is: " + wordCount);
       System.out.println("The total number of three lettered words is: "+numOfThrees);
       System.out.println("Percentage of occurence of three lettered word is: " + threePercent + "%");
             
    }
}
/**
 * Sample output
 * 
Good morning life and all
Things glad and beautiful
My pockets nothing hold
But he that owns the gold
The sun is my great friend
His spending has no end
Hail to the morning sky
Which bright clouds measure high
Hail to you birds whose throats
Would number leaves by notes
Hail to you shady bowers
And you green fields of flowers
Hail to you women fair
That make a show so rare
In cloth as white as milk
Be it calico or silk
Good morning life and all
Things glad and beautiful

The total number of words is: 93
The total number of three lettered words is: 20
Percentage of occurence of three lettered word is: 21.51%
 * 
 * 
 * 
 * 
 */