
/**
 * Shai Caspin
 * 11/15/16
 * Carrboro High School
 * Program 335h - final 2003, fatuous dice function
 * 
 * Description: A certain game requires that two dice be rolled, one at a time. If p and q are the numbers 
 *              rolled on the first and second die, respectively the value of the roll in the game depends 
 *              on a preset rule depending on whether they are odd or even.
 * What I learned: I learned how to use integrates decision making structures.
 * Difficulties: I didn't know how to use loops becuase this way is so much easier.
 */

import java.util.*;
import java.io.*;

public class DiceFunction
{
    public static void main(String[] args)
    {
        //GET USER INPUT
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value of first dice: ");
        int diceP = input.nextInt(7);
        System.out.print("Enter value of second dice: ");
        int diceQ = input.nextInt(7);
        
        //DECRLARE VARIABLE FOR CALCULATION
        int rule=0;
        
        //DETERMINE WHETHER ROLLS ARE EVEN OR ODD, AND CALLCULATE RULE ACCORDINGLY
        if (diceP%2==0) //P is even
        {
            if (diceQ%2==0) //Q is even
            {
                if (diceP==diceQ) //They equal each other
                    rule = 3 * diceP;
                else //They are different
                    rule = diceP+diceQ;
            }
            else // Q is odd
            {
                rule = (2*diceP) + diceQ;
            }
        }
        else //P is odd
        {
           if (diceQ%2==1)//Q is odd
            {
                if (diceP==diceQ) //They equal each other
                    rule = 3 * diceP;
                else
                    rule = diceP+diceQ;
            }
            else //Q is even
            {
                rule = diceP + (2*diceQ);
            } 
        }
        
        //Display final value calculation
        System.out.print("The value of the rule is: " + rule);
    }
}

/**
 * Sample output
 * 
Enter value of first dice: 2
Enter value of second dice: 5
The value of the rule is: 9
 * 
 * 
 * 
Enter value of first dice: 4
Enter value of second dice: 4
The value of the rule is: 12
 * 
 * 
 * 
Enter value of first dice: 6
Enter value of second dice: 2
The value of the rule is: 8
 * 
 * 
 * 
Enter value of first dice: 1
Enter value of second dice: 3
The value of the rule is: 4
 * 
 * 
 * 
Enter value of first dice: 5
Enter value of second dice: 5
The value of the rule is: 15
 * 
 * 
 * 
Enter value of first dice: 1
Enter value of second dice: 2
The value of the rule is: 5
 * 
 * 
 * 
Enter value of first dice: 6
Enter value of second dice: 6
The value of the rule is: 18 
 */