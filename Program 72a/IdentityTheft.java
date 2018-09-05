
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 09/27/16
 * Program 72a - Identity theft
 * 
 * Description: This program takes four two-digit credit card numbers and find the additional letter atatched to the
 *              end by taking the mod of the sum of the numbers withr espect to 26.
 * What I learned: I used the mod expression for the first time in a program. I also learned how to use ASCII values
 *                 to represent integer variables as letters.
 * Difficulties: It took me a while to figure out that I had to add the 65, I just forgot.              
 */
 
//allow user input
import java.io.* ;
import java.util.* ;

public class IdentityTheft
{
  public static void main(String[] args)
  {
   Scanner creditCardNumbers = new Scanner(System.in); //declare scanner class
   
   System.out.print("Enter the credit card number (XX XX XX XX): "); //inpur credit card numbers
   int integer1 = creditCardNumbers.nextInt() ;
   int integer2 = creditCardNumbers.nextInt() ;
   int integer3 = creditCardNumbers.nextInt() ;
   int integer4 = creditCardNumbers.nextInt() ;
   
   int remainder = (integer1 + integer2 + integer3 + integer4) % 26 ; //getting the sum and remainder of devision by 26
   
   char securityLetter = (char) (65 + remainder) ;//getting character corresponding with the remainder
   
   //print output
   System.out.println("The correct number and code is "+integer1+" "+integer2+" "+integer3+" "+integer4+" "+securityLetter);
  
   
    }
}
/**
 * Sample output
Enter the credit card number (XX XX XX XX): 44 21 34 78
The correct number and code is 44 21 34 78 V
 * 
Enter the credit card number (XX XX XX XX): 16 26 26 26
The correct number and code is 16 26 26 26 Q
 * 
Enter the credit card number (XX XX XX XX): 26 54 74 56
The correct number and code is 26 54 74 56 C
 *
Enter the credit card number (XX XX XX XX): 26 26 26 26
The correct number and code is 26 26 26 26 A
 */