
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 10/11/16
 * Program 162a - small factorials
 * 
 * Description: This program runs a loop to calculate factorials as long as the user wants to. It can only calculate "small" factorials.
 *              The program runs at least once and then asks the suer to respond to whether they want another one or not.
 * What I learned: I learned how to use nested loops and how to calculate factorials using a for loop. I also learned how to use boolean
 *                 string conditions for running a loop, and also how to unsure input is in correct format.
 * Difficulties:I tried different variations of the factorial loop but some of them were too complicated since I tried to go from the 
 *              given number towards 1, but that didn't work as well as this. Otherwise, I really liked this program.
 */

//allow user input
import java.io.*;
import java.util.* ;
public class SmallFactorials
{
    public static void main(String[] args)
    {
        String condition = "Yes" ; //set initial condition to run loop
        Scanner input = new Scanner(System.in);
        
        while ("Yes".equals(condition)) //loops runs as long as user keeps answering yes to the question.
        {
            //user input for number to find the factorial of
            System.out.print("\nEnter a number: ");
            int number = input.nextInt();
            
            int factorial=1; //can't start at 0 because result will be zero
            for (int i=2;i<=number; i++){ //starts at two as long as i is smaller than number chosen, incremented by 1
                factorial=factorial*i; //multiply last loop result by the next number
            }
            
            System.out.print("The factorial of "+number+ " is " + factorial); //output of factorial
            System.out.print("\nWould you like to calculate another number? "); //question for lopp condition
            String answer = input.next(); //user input for loop condition
            
            //ensures string is the same when first letter is capitalized and rest is lower cased
            String lowerAnser = answer.toLowerCase();
            condition = answer.substring(0, 1).toUpperCase() + answer.substring(1); 
        }       
        
        System.out.print("\n\"END FACTORIAL PROCESSING\"");
    }
}
/**
 * Sample output
 * 
Enter a number: 6
The factorial of 6 is 720
Would you like to calculate another number? yes

Enter a number: 9
The factorial of 9 is 362880
Would you like to calculate another number? yes

Enter a number: 12
The factorial of 12 is 479001600
Would you like to calculate another number? yes

Enter a number: 1
The factorial of 1 is 1
Would you like to calculate another number? no

"END FACTORIAL PROCESSING"
 * 
 * 
Enter a number: 7
The factorial of 7 is 5040
Would you like to calculate another number? yes

Enter a number: 9
The factorial of 9 is 362880
Would you like to calculate another number? yes

Enter a number: 3
The factorial of 3 is 6
Would you like to calculate another number? no

"END FACTORIAL PROCESSING"
 * 
 * 
Enter a number: 11
The factorial of 11 is 39916800
Would you like to calculate another number? no

"END FACTORIAL PROCESSING"
 *
 *
Enter a number: 15
The factorial of 15 is 2004310016
Would you like to calculate another number? yes

Enter a number: 16
The factorial of 16 is 2004189184
Would you like to calculate another number? yes

Enter a number: 09
The factorial of 9 is 362880
Would you like to calculate another number? no

"END FACTORIAL PROCESSING"
 *
 *
Enter a number: 2
The factorial of 2 is 2
Would you like to calculate another number? yes

Enter a number: 9
The factorial of 91 is 362880
Would you like to calculate another number? no

"END FACTORIAL PROCESSING"
 *
 *
Enter a number: 8
The factorial of 8 is 40320
Would you like to calculate another number? yes

Enter a number: 3
The factorial of 3 is 6
Would you like to calculate another number? yes

Enter a number: 7
The factorial of 17 is 5040
Would you like to calculate another number? No

"END FACTORIAL PROCESSING"
 *
 *
Enter a number: 9
The factorial of 9 is 362880
Would you like to calculate another number? yes

Enter a number: 7
The factorial of 7 is 5040
Would you like to calculate another number? yes

Enter a number: 2
The factorial of 2 is 2
Would you like to calculate another number? yes

Enter a number: 7
The factorial of 7 is 5040
Would you like to calculate another number? yes

Enter a number: 5
The factorial of 5 is 120
Would you like to calculate another number? no

"END FACTORIAL PROCESSING"
 */