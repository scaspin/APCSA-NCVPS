
/**
 * Shai Caspin
 * 12/06/16
 * Carrboro HS
 * Program 512d- UPC Codes
 * 
 * Description:A UPC is printed on almost every item sold these days.  It is a series of lines of 
 *             varying thickness that can be read by a bar code reader.  A UPC code has 12 digits.  
 *             The first digit is a generic product type code (for example 2 for meat), the next 
 *             five digits correspond to a unique product.  The next five digits represent the 
 *             manufacturer and the final line in which the digit is not printed is a check digit 
 *             that determines the validity of the previous code segment. To check the validity of 
 *             the code you need to analyze each digit in the code including the check digit. Assume 
 *             that the first digit is in position zero, add the digits in the even positions and 
 *             multiply the result by 3. Add this to the sum of the odd positioned digits. Only if 
 *             the total is a multiple of 10 is the UPC number valid.
 * What I learned: I learned how to use converstions between char, string, and int variables.
 * Difficulties: It took me a while to figure out how to write this, but I eventually did.2

 */
import java.util.*;
import java.io.*;

public class Program512d
{
    public static void main(String[] args)
    {
       //TEST WHETHER FILE EXISTS AND CAN BE READ OR NOT
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("prog512.dat"));
           
            } 
         catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        
             
       while (inFile.hasNextLine()) //runs for as long as new lines of UPC codes are available
       {
           String upcCode = inFile.nextLine(); //get one line
           int sumEven=0, sumOdd=0; //initialize counters for sums
           
           for (int i = 0; i < upcCode.length(); i++) //run through each digit in the code
           {
               char c = upcCode.charAt(i); //selsct digit based on position
               int cNum = Character.getNumericValue(c); //convert digit to integer from char
               
               if (i%2==0) //decide whether position is even or odd and add to appropriate counter
               {
                   sumEven += cNum;
                }
               else
               {
                   sumOdd += cNum;
                }
                
            }
           
           //calculate whether code is valid or not 
           double validCalc = (3*sumEven + sumOdd)/10.0;
           String validity = "";
           if (validCalc==(int)validCalc) //assign validity based on if calculation above yield an integer or a decimal
           {
               validity = "  Valid";
            }
           else
           {
               validity = "Invalid";
            }
            
           //Print results
           System.out.println("\n UPC CODE      VALIDITY"); 
           System.out.println(upcCode + "\t" + validity);
        }
    }
}
/**
 * Sample output
 * 
 * 
UPC CODE      VALIDITY
016499215511	  Valid

 UPC CODE      VALIDITY
372415613274	Invalid

 UPC CODE      VALIDITY
155512994610	  Valid

 UPC CODE      VALIDITY
011165459192	Invalid

 UPC CODE      VALIDITY
838241762110	Invalid
 * 
 * 
 */