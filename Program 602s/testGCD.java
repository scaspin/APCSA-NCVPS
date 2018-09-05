
/**
 * Greatest Common Divisor Program
 * 
 * @author Shai Caspin
 * @version 01/19/17
 */

import java.util.*;
import java.io.*;

public class testGCD
{
    public static void main(String[] args)
    {
        //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog280a (1).dat"));
            
        } 
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
           System.out.println("The GCD of " + a + " and " + b+ " is " + GCD(a,b));
        }
    }
    
    public static int GCD(int a, int b)
    {
        if (a<b)
        {
            int placeHolder = b;
            b=a;
            a=placeHolder;
        }
        
        while (a!=0)
        {
            a = a-b;
            
            if (a<b && a!=0)
            {
                int placeHolder = b;
                b=a;
                a=placeHolder;
            }
        }
        
        return b;
    }
}
/**
 * Sample output
 * 
The GCD of 25 and 10 is 5
The GCD of 81 and 41 is 1
The GCD of 255 and 138 is 3
The GCD of 847 and 624 is 1
The GCD of 84 and 420 is 84
The GCD of 182 and 637 is 91
The GCD of 620 and 420 is 20
The GCD of 36 and 24 is 12
The GCD of 75 and 125 is 25
The GCD of 1 and 17 is 1
 * 
 * 
 */