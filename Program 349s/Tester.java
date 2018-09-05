
/**
 * Shai Caspin
 * Carrboro High School
 * Tester class for Class Records and final grade program
 * 02/05/16
 */
import java.io.*;
import java.util.*;

public class Tester
{
    public static void main(String[] args)
    {
        //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog349f.dat"));
            
        } 
       catch (FileNotFoundException e) //output if file cannot be found
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        
       System.out.println("Student   Quiz1   Quiz2   MidTerm   Final   Final%   Grade");
       int count = 1;
       while (inFile.hasNextLine()) //Runs for as many lines as exist in the document
       {
           //String line = inFile.nextLine(); //inputs the next line
           
           int quiz1 = inFile.nextInt();
           int quiz2 = inFile.nextInt();
           int mt = inFile.nextInt();
           int fin = inFile.nextInt();
           
           StudentRecord student = new StudentRecord();
           student.studentRecord(quiz1, quiz2, mt, fin);
           System.out.println("   "+count + "\t    "+student.studentRecord());
           
           count++;
        }
  
    }
}
/**
 * Sample output
 * 
Student   Quiz1   Quiz2   MidTerm   Final   Final%   Grade
   1	    8	    7	    89	     94	    88.0	B
   2	    9	    6	    77	     90	    83.0	B
   3	    10	    10	    65	     88	    85.25	B
   4	    7	    5	    80	     81	    75.5	C
 * 
 * 
 * 
Student   Quiz1   Quiz2   MidTerm   Final   Final%   Grade
   1	    8	    7	    89	     94	    88.0	B
   2	    9	    6	    77	     90	    83.0	B
   3	    10	    10	    65	     88	    85.25	B
   4	    7	    5	    80	     81	    75.5	C
   5	    10	    10	    70	     90	    87.5	B
   6	    14	    6	    45	     100	86.25	B
   7	    10	    10	    90	     99	    97.0	A
   8	    5	    6	    70	     80	    71.25	C
   9	    1	    2	    90	     80	    66.25	D
   10	    6	    8	    90	     100	90.0	A
   11	    9	    9	    90	     90	    90.0	A
   12	    7	    8	    90	     100	91.25	A
 * 
 * 
 * 
 */
