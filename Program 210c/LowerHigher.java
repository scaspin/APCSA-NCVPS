/**
 * Shai Caspin
 * 11/10/16
 * Carrboro High School (NCVPS)
 * Program 210c- Lower or Higher Game
 * 
 * Description: This program simulates the guessing game “Higher/Lower”. The computer will generate a number between 
 *              1 and 100 inclusive.  The user will be asked to guess the number.  If the guess is incorrect the 
 *              program will give a clue of whether the guess was too high or too low and asks the user to guess again.  
 *              This procedure continues until the user finally guesses the correct number.  The program will also 
 *              keep track of and print out the number of guess it took before the user guessed the correct number.
 * What I learned: I learned how to use the scanner and random classes together in one program.
 * Difficulties: I tried setting a range for the numbers generated so as to not include the number 0, but then I realized
 *              I could just add one to the nextInt procedure from 0 to 100 (range 0-99) which will make the new range the
 *              desired one from 1 to 100.
 */

import java.util.*;
import java.io.*;

public class LowerHigher
{
   public static void main(String[] args)
   {
       //DECLARE ALL PROCEUDRES USED IN THE CLASS
       Random rndm = new Random();
       Scanner input = new Scanner(System.in);
       
       //DECLARE VARIABLES TO BE USED IN LOOPS AND CONDITIONS
       final int REAL_NUMBER = 1+ rndm.nextInt(100);
       int numGuess = 0; //start as zero since zero will never equal to real number
       int guessNum = 0; 
       
       //Initial output to declare the name of the program
       System.out.println("I am thinking of a number between 1 and 100");
      
       
       while (numGuess!=REAL_NUMBER)
       {
           //Question to user
           System.out.print("What do you think it is? ");
           numGuess = input.nextInt();
           
           //coutner of guesses, needs to be before decision making statement so correct num of guesses is displayed
           guessNum++;
           
           //Determining how clsoe the number is to the real one
           if(numGuess==REAL_NUMBER)
           {
               System.out.println("\n~!!You got it right in " +guessNum+ " guesses!!~\n\tThe number was "+REAL_NUMBER);
            }
           else if (numGuess<REAL_NUMBER)
           {
               System.out.println("Higher! Try Again");
            }
           else
           {
               System.out.println("Lower! Try Again");
            }
        }
    }
}
/**
 * Sample output
 * 
I am thinking of a number between 1 and 100
What do you think it is? 67
Higher! Try Again
What do you think it is? 99
Lower! Try Again
What do you think it is? 80
Higher! Try Again
What do you think it is? 87
Lower! Try Again
What do you think it is? 84
Higher! Try Again
What do you think it is? 85

~!!You got it right in 6 guesses!!~
	The number was 85
 * 
 * 
 * 
I am thinking of a number between 1 and 100
What do you think it is? 50
Higher! Try Again
What do you think it is? 75
Higher! Try Again
What do you think it is? 88
Lower! Try Again
What do you think it is? 80
Higher! Try Again
What do you think it is? 84

~!!You got it right in 5 guesses!!~
	The number was 84
 * 
 * 
 * 
I am thinking of a number between 1 and 100
What do you think it is? 50
Higher! Try Again
What do you think it is? 75
Higher! Try Again
What do you think it is? 85
Lower! Try Again
What do you think it is? 80
Lower! Try Again
What do you think it is? 77
Lower! Try Again
What do you think it is? 76

~!!You got it right in 6 guesses!!~
	The number was 76
 * 
 * 
 */