
/**
 * DigitExtractor application that prompts the user for an integer 
 * (in the range: 0-9999) and then displays either the ones, tens, 
 * hundreds, or thousands digit of the number. The user will select 
 * from a menu which digit they wish to display.
 *  
 * Shai Caspin
 * 01/25/16
 * Carrboro High School 
 * Program 321e - digit extractor
 */
import java.util.*;
import java.io.*;

public class Program321e
{
   static Scanner input = new Scanner(System.in);
   //establish universal objects and variables
   public static int digit;
   
   //Main method to get input and print results
   public static void main(String[] args)
   {
       //GET INPUT REGARDING NUMBER AND OPRION
       System.out.print("Enter a number (0 to 9999): ");
       int num = input.nextInt();
       
       System.out.print("\nOptions for digit extraction:\n 1)Units \n 2)Tens \n 3)Hundreds \n 4)Thousands \n 5)Quit\n ");
       System.out.print("\nWhich option?");
       int choice = input.nextInt();
        
       //Goes to different functions based on choice and then ends program
       switch (choice)
       {
            case 1: System.out.print("The units digit is " + units(num));
                    break;
            case 2: System.out.print("The tens digit is " + tens(num));
                    break;
            case 3: System.out.print("The hundreds digit is " + hundreds(num));
                    break;
            case 4: System.out.print("The thousands digit is " + thousands(num));
                    break;      
            default: System.out.print("Choice is invalid");
                    break; 
       }
    }
   
    //gets single space of number
   public static int units(int num)
   {
       digit = num;
       while (digit > 10) 
       {
           digit = digit%10;
       }
       return digit;
    }
    
   //get tens digit 
   public static int tens(int num)
   {
       digit = units((num - units(num))/10);
       return digit;
    } 
   
    //get hundrends digit
   public static int hundreds(int num)
   {
       digit = units((num - tens(num)*10 - units(num))/100);
       return digit;
    } 
   
    //get thousands digit
   public static int thousands(int num)
   {
       digit = units((num - units(num) - tens(num)*10 - hundreds(num)*100)/1000);
       return digit;
    } 
}

/**
 * Sample output
 * 
Enter a number (0 to 9999): 12347

Options for digit extraction:
 1)Units 
 2)Tens 
 3)Hundreds 
 4)Thousands 
 5)Quit
 
Which option?4
The thousands digit is 2
 * 
 * 
 * 
Enter a number (0 to 9999): 1356

Options for digit extraction:
 1)Units 
 2)Tens 
 3)Hundreds 
 4)Thousands 
 5)Quit
 
Which option?2
The tens digit is 5
 * 
 * 
 * 
Enter a number (0 to 9999): 1506

Options for digit extraction:
 1)Units 
 2)Tens 
 3)Hundreds 
 4)Thousands 
 5)Quit
 
Which option?3
The hundreds digit is 5
 * 
 * 
 * 
Enter a number (0 to 9999): 98765

Options for digit extraction:
 1)Units 
 2)Tens 
 3)Hundreds 
 4)Thousands 
 5)Quit
 
Which option?4
The thousands digit is 8
 * 
 */