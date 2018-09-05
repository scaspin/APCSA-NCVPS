
/**
 * Shai Caspin
 * Carrboro HS 
 * 12/06/16
 * Program 505c- in between
 * 
 * Description: This program find out whether an animal name is between the words dinosaur and walrus in a dictionary.
 * What I learned: I learned how to use the compareTo function for strings.
 * Difficulties:Accidentaly had some typos
 */

import java.util.*;
import java.io.*;

public class Prog505c
{
   public static void main(String[] args)
   {
       //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog505c.dat"));
           
            } 
         catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
       
       //Establish final bounds for other animals to be within
       final String LOWER_BOUND = "dinosaur", UPPER_BOUND = "walrus";
       
       //COMPARE EACH ANIMAL READ WITH BOUNDS
       while (inFile.hasNextLine()) //runs until no more animals can be read from file
       {
           String animal = inFile.nextLine(); //make animal entire string on one line
           String lowerCaseAnimal = animal.toLowerCase(); //convert to lowercase so compareTo function works better
           
           //Checks whether the string is between the two bounds previously set
           if (lowerCaseAnimal.compareTo(LOWER_BOUND) > 0 && lowerCaseAnimal.compareTo(UPPER_BOUND) < 0)
           {
				System.out.println(animal + "\tbetween");
		   } 
		   else
		   {
				System.out.println(animal + "\tnot between");
            }
        }
    }
}
/**
 * Sample output
 * 
Vampire     	between
Monkey      	between
Elephant    	between
Ape         	not between
Lion        	between
Hippopotamus	between
Ant            	not between
Zebra       	not between
Yak         	not between
Antelope    	not between
Dingo       	not between
Whale        	not between
Dog         	between
Ant         	not between
Tiger       	between
Rhino       	between
Kangaroo     	between

 * 
 */