
/**
 * Shai Caspin
 * 01/20/17
 * Carrboro High School
 * 
 * Detscription: This program uses a Greatest Common Divisor class to find the least common multiplier of three numbers.
 */
import java.util.*;
import java.io.*;

public class Prog603b
{
    public static void main(String[] args)
    {
        //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog603b.dat"));
            
        } /Users/shaicaspin/Desktop/My java programs/Prog349f.dat
       catch (FileNotFoundException e) //output if file cannot be found
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }

        while (inFile.hasNextLine()) //Runs for as many lines as exist in the document
       {
           //String line = inFile.nextLine(); //inputs the next line
           
           int a = inFile.nextInt();
           int b = inFile.nextInt();
           int c = inFile.nextInt();
           
           GCD numbers = new GCD();
           
           System.out.println("The LCM of " + a + ", " +b+", and " + c+ " is " + numbers.GCD(a,b,c));
        }
    }
}
/**
 * Sample output
 * 
The LCM of 5, 10, and 20 is 5
The LCM of 18, 24, and 52 is 2
The LCM of 12, 10, and 26 is 2
The LCM of 99, 63, and 24 is 3
The LCM of 62, 16, and 24 is 2
 * 
 * 
 */