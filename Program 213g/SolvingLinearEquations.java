
/**
 * Shai Caspin
 * Carrboro High School
 * 11/09/16
 * Program 213g- Solving linear equations
 * 
 * Description: This program solves linear equations in the form Ax + B = 0.
 * What I learned: I furthered my knowledge of how to use decision making statements in programs.
 * Difficulties: The instructions said to use loop control, but I couldn't figure out where that
 *               would be necessary.
 */

//Allow user input
import java.util.*;
import java.io.*;

public class SolvingLinearEquations
{
    public static void main(String[] args)
    {
        //GET USER INPUT REGARDING EQUATION THAT NEEDS TO BE SOLVED
        Scanner input= new Scanner(System.in);
        
        System.out.println("Solving linear equations when Ax+B=0");
        System.out.print("Enter coefficient A: ");
        double coefA = input.nextDouble();
        
        System.out.print("Enter value for B: ");
        double coefB = input.nextDouble();
        
        
        //CALCULATE THE VALUE OF X IN THAT EQUATION
        double xEquals = (int)(-1 * coefB / coefA *100000.00 + 0.5)/100000.00;
        
        
        //PRINT THE RESULT OF THE CALCULATION ACCORDING TO NUMBERS
        if (coefA==0 && coefB==0) //when both are zero, the solutions are infinite
        {
            System.out.println(coefA+"x+" +coefB+"=0 --> There is an infinite number of solutions" );
        }
        else if (coefA==0)
        //when the coefficient on the x is zero, the line is horizontal and will not intersect with the x axis, therefore will not have a value for x
        {
          System.out.println(coefA+"x+" +coefB+"=0 --> There are no solutions" );  
        }
        else if (coefB==0)
        //No value for the B coefficient means that the line intersects the origin at x=0 since there is not vertical transformation
        {
            System.out.println(coefA+"x=0 --> x=0" );
        }
        else //in any case where both A B are nonzero numbers
        {
          //make sure sign on number B is correct when printed
          if (coefB>0) //positive numbers need a positive signs
            {
              System.out.println(coefA+"x+" +coefB+"=0 --> x="+ xEquals );
            }
            else
            {//negative numbers don't need a sign since the "-" will be printed with the numebr
               System.out.println(coefA+"x" +coefB+"=0 --> x="+ xEquals ) ;
            }  
        }
    }
}

/**
 * Sample output
 * 
Solving linear equations when Ax+B=0
Enter coefficient A: 4
Enter value for B: -5
4x-5=0 --> x=1.25
 *
 *
 *
Solving linear equations when Ax+B=0
Enter coefficient A: 7
Enter value for B: 12
7x+12=0 --> x=-1.71428
 *
 *
 *
Solving linear equations when Ax+B=0
Enter coefficient A: 0
Enter value for B: 0
0x+0=0 --> There is an infinite number of solutions
 *
 *
 *
Solving linear equations when Ax+B=0
Enter coefficient A: 0
Enter value for B: 7
0x+7=0 --> There are no solutions
 *
 *
 *
Solving linear equations when Ax+B=0
Enter coefficient A: 3.5
Enter value for B: -1.6
3.5x-1.6=0 --> x=0.45714
 *
 *
 *
Solving linear equations when Ax+B=0
Enter coefficient A: 98.2
Enter value for B: 31
98.2x+31.0=0 --> x=-0.31567
 *
 *
 *
Solving linear equations when Ax+B=0
Enter coefficient A: 6
Enter value for B: 0
6.0x=0 --> x=0

 */