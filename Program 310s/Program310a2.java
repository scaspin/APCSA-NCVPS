
/**
 * Shai Caspin
 * 01/04/17
 * Carrboro HS
 * Program 310a2
 * 
 * Description:Modify this program using methods so that it uses an asterisk as a default character for the histogram 
 *             but overload the method so that the user can supply the character to use as the graph. Use the keyboard 
 *             to supply test data for your program. 
 * What I learned: How to use methods and static scanners
 * Difficulties: I trried using strings instead of characters but this way is easier.
 */

import java.io.*;;
import java.util.*;

public class Program310a2
{
    //establish scanner
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        //get value to print in histogram
        System.out.print("Enter value to chart: ");
        double number = input.nextDouble();
        double numRounded = (int)(number+0.5);//round to nearest integer
        
        //check to see what charcter to use for histogram by referencing to method
        System.out.print("\nDo you wish to supply the graphing character? (y/n)");
        char answer = input.next().charAt(0);
        
        char printCharacter = '*';
        if (answer=='y')
        {
             printCharacter = character();
        }
        
        //print the roudned number of characters
        System.out.println();
        for (int print = 1; print<=numRounded; print++)
        {
            System.out.print(printCharacter);
        }
        System.out.print(number);
    }
    
    //method to determine which character to use
    public static char character()
    {
        System.out.print("Enter the character: ");
        char graphCharacter = input.next().charAt(0);
        
        return graphCharacter;
    }
}
/**
 * Sample output
 * 
Enter value to chart: 13.5

Do you wish to supply the graphing character? (y/n)n

**************13.5
 * 
 * 
 * 
Enter value to chart: 3.2

Do you wish to supply the graphing character? (y/n)y
Enter the character: $

$$$3.2
 * 
 * 
 * 
Enter value to chart: 16.1

Do you wish to supply the graphing character? (y/n)y
Enter the character: @

@@@@@@@@@@@@@@@@16.1
 * 
 * 
 *
Enter value to chart: 0.0

Do you wish to supply the graphing character? (y/n)n

0.0 
 * 
 * 
 * 
Enter value to chart: 78.2

Do you wish to supply the graphing character? (y/n)y
Enter the character: ^

^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^78.2
 * 
 * 
 * 
Enter value to chart: 2.5

Do you wish to supply the graphing character? (y/n)y
Enter the character: )

)))2.5
 * 
 * 
Enter value to chart: 12.3

Do you wish to supply the graphing character? (y/n)y
Enter the character: &

&&&&&&&&&&&&12.3
 * 
 */