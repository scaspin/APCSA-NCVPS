
/**
 * Shai Caspin
 * 12/21/16
 * Carrboro HS
 * Program 335t- prime sandwich
 * 
 * Description: This program inputs an integer, "N",  greater  than 2, and then finds the largest prime that is less than or equal to "N" and the smallest prime 
 *              that is greater than or equal to "N".  To simplify the process, include a method "isprime" to help you solve the problem.
 *              After completing the first calculation the program asks the user to determine if they would like to check another number.
 * What I learned: How to combine methods and return results.
 * Difficulties: It took me a while to figure out how to program the isPrime method, but once I did it was a lot easier.
 */

import java.io.*;
import java.util.*;

public class Program335t
{
    static Scanner input = new Scanner(System.in);
    
    //Main function that runs a loop with the
    public static void main()
    {
        boolean condition = true;
        
        do
        {
            System.out.print("\nEnter an integer greater than or equal to two: ");
            int num = input.nextInt();
            
            //Prints the result of the function
            System.out.println("N is between the prime numbers " + lowPrime(num) + " and " + highPrime(num));
            
            //asks the user if they want another check
            System.out.print("\nWould you like to check another number? (y/n)");
            String answer = input.next();
            
            if (answer.equals("y"))
            {
                condition = true;
            }
            else
            {
                condition = false;
                break;
            }
        }while (condition=true);
    }
    
    //function that returns whether number is prime
    private static boolean isPrime(int N)
    {
        //Counts all the prime numbers a number N has
        int countPrimes=0;
        for(int i=1;i<=N;i++)
        {
            if(N%i==0)
            {
                countPrimes++;
            }
        }
        
        if(countPrimes==2)//Prime numbers have 2 factors, 1 and the number itself.
        {
            return true;
        }
        else
        {
            return false; 
        }
    }
    
    //finds closest lower bound prime value
    private static int lowPrime(int N)
    {
        for (int i=N; i>2; i--)
        {
            if (isPrime(i)==true)
            {
                return i;
            }
        }
        return 0;
    }
    
    //finds closest upper bound prime value
    private static int highPrime(int N)
    {
        for (int i=N; i>2; i++)
        {
            if (isPrime(i)==true)
            {
                return i;
            }
        }
        return 0;
    }
}

/**
 * Sample output
 * 

Enter an integer greater than or equal to two: 23
N is between the prime numbers 23 and 23

Would you like to check another number? (y/n)y

Enter an integer greater than or equal to two: 24
N is between the prime numbers 23 and 29

Would you like to check another number? (y/n)y

Enter an integer greater than or equal to two: 32
N is between the prime numbers 31 and 37

Would you like to check another number? (y/n)n
 * 
 * 
 * 
Enter an integer greater than or equal to two: 15
N is between the prime numbers 13 and 17

Would you like to check another number? (y/n)y

Enter an integer greater than or equal to two: 98
N is between the prime numbers 97 and 101

Would you like to check another number? (y/n)n
 * 
 * 
 * 

Enter an integer greater than or equal to two: 50
N is between the prime numbers 47 and 53

Would you like to check another number? (y/n)y

Enter an integer greater than or equal to two: 68
N is between the prime numbers 67 and 71

Would you like to check another number? (y/n)y

Enter an integer greater than or equal to two: 100
N is between the prime numbers 97 and 101

Would you like to check another number? (y/n)y

Enter an integer greater than or equal to two: 4
N is between the prime numbers 3 and 5

Would you like to check another number? (y/n)y

Enter an integer greater than or equal to two: 1457
N is between the prime numbers 1453 and 1459

Would you like to check another number? (y/n)n

 */
