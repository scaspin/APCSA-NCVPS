
/**
 * Write a description of class Program435t here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Program435t
{
    private static char gender;
    private static char bone;
    private static int age;
    private static double length;
    
    public static void main(String[] args)
    {
        Scanner inFile = null; //establish scanner
       try 
       {
            // define the scanner to read the file
             inFile = new Scanner (new File("Prog435t.dat"));
            
       } 
       catch (FileNotFoundException e) //output if file cannot be found
       {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
    
       }
        
       while (inFile.hasNext())
       {
           gender = inFile.charAt(0);
           bone = inFile.charAt(2);
           
           age=inFile.nextInt();
           
           System.out.println(gender+"\t"+bone+"\t"+age);
        }
    }
}
