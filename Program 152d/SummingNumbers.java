
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 10/11/16
 * Program 152d- summing some numbers
 * 
 * Description: This program sums the numbers between any two numbers given by the user, 
 *              and calculates the average of the number.
 * What I learned: I learned how to use while loops and use uncremntation within them.
 * Difficulties: I had a hard time finding the perfect placement for the icnrementation
 *              and printing so it will print all numbers that are being added.
 * 
 */

import java.io.* ;
import java.util.* ;

public class SummingNumbers
{
   public static void main(String[] args)
   {
       Scanner numbers = new Scanner(System.in);
       
       //Get user input
       System.out.print("Enter starting value for summation: ") ;
       int startValue = numbers.nextInt(); 
       System.out.print("Enter ending value for summation: ") ;
       int end = numbers.nextInt();
       
       //declare variable used in loop
       int value = startValue;
       int addition=value;
       int n=1; //to include the first number
       
       System.out.println(addition);
       while (addition<end) //works until the number added is one less than end value, but is that icnremented to be end value
       {
           addition++  ; //increments number added by 1
           value+= addition ; //sum calculation every loop
           System.out.println(addition); //display all numbers between two numbers
           n++ ;//increment to count loops for average of sum based on numbers added
       }
       
       //calculate and round mean
       double average = (int)((double)value / (n)*100 +0.5)/100.00;
       
       System.out.println("Sum of the numbers from " + startValue + " to " +end+ " is: " + value);
       System.out.println("The average of the numbers from " + startValue + " to " +end+ " is: " + average);
   }
}
/**
 * Sample output
 * 
Enter starting value for summation: 5
Enter ending value for summation: 8
5
6
7
8
Sum of the numbers from 5 to 8 is 26
The average of the numbers from 5 to 8 is 6.5
 *
 *
Enter ending value for summation: 10
1
2
3
4
5
6
7
8
9
10
Sum of the numbers from 1 to 10 is: 55
The average of the numbers from 1 to 10 is: 5.5
 *
 *
Enter ending value for summation: 3
-3
-2
-1
0
1
2
3
Sum of the numbers from -3 to 3 is: 0
The average of the numbers from -3 to 3 is: 0.0
 *
 *
Enter starting value for summation: 6
Enter ending value for summation: 16
6
7
8
9
10
11
12
13
14
15
16
Sum of the numbers from 6 to 16 is: 121
The average of the numbers from 6 to 16 is: 11.0
 *
 *
Enter starting value for summation: -2
Enter ending value for summation: 10
-2
-1
0
1
2
3
4
5
6
7
8
9
10
Sum of the numbers from -2 to 10 is: 52
The average of the numbers from -2 to 10 is: 4.0
 */